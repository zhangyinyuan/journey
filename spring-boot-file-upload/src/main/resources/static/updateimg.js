window.onload = function() {
	var input = document.getElementById("upgteimg");
	var showui = document.getElementById("showui");
	var result;
	var dataArr = [];
	//var fd;
	var fd = new FormData();;
	var oSubmit = document.getElementById("submit");
	function randomString(len) {
		len = len || 32;
		var $chars = 'ABCDEFGHJKMNPQRSTWXYZabcdefhijkmnprstwxyz2345678';
		var maxPos = $chars.length;
		var pwd = '';
		for (i = 0; i < len; i++) {
			pwd += $chars.charAt(Math.floor(Math.random() * maxPos));
		}
		return pwd;
	}
	if (typeof FileReader === 'undefined') {
		alert("抱歉，你的浏览器不支持 FileReader");
		input.setAttribute('disabled', 'disabled');
	} else {
		input.addEventListener('change', readFile, false);
	}
	function readFile() {
		//fd = new FormData();
		var iLen = this.files.length;
		var index = 0;
		var currentReViewImgIndex = 0;
		for (var i = 0; i < iLen; i++) {
			if (!input['value'].match(/.jpg|.gif|.png|.jpeg|.bmp/i)) {
				return alert("上传的图片格式不正确，请重新选择");
			}
			var reader = new FileReader();
			reader.index = i;
			fd.append(i, this.files[i]);
			reader.readAsDataURL(this.files[i]);
			reader.fileName = this.files[i].name;
			reader.files = this.files[i];
			reader.onload = function(e) {
				var imgMsg = {
					name: randomString(5),
					base64: this.result,
				}
				if(dataArr.length<5){
							dataArr.push(imgMsg)
							if(dataArr.length == 5){
								$(".upimg").hide()
							}
							for (var j = 0; j < dataArr.length; j++) {
								currentReViewImgIndex = j
							}
							result = '<div class="showdiv"><div class="del_btn"/>×</div></div><img id="img' + currentReViewImgIndex + randomString(1) + randomString(2) + randomString(5) + '" class="showimg" name="tmpImg" style="width: 100px;height: 100px" src="' + this.result + '" />';
							var li = document.createElement('li');
							li.innerHTML = result;
							showui.appendChild(li);
							index++;
				}else{
				}

			}
		}
	}
	function onclickimg() {
		var dataArrlist = dataArr.length;
		var lilength = document.querySelectorAll('.showdiv');
		for (var i = 0; i < lilength.length; i++) {
            lilength[i].onclick = function(num) {
				return function() {
					if (dataArr.length == 1) {
						dataArr = [];
						$("ul#showui").html("")
					} else if(dataArr.length<6){
						$(".upimg").show()
            $("ul#showui li:eq(" + num + ")").remove() 
              dataArr.splice(num, 1)
					}
				}
       } (i)
		}
	}
	showui.addEventListener("click",function() {
		onclickimg();
    },true);
    function send() {
		for (var j = 0; j < dataArr.length; j++) {
			console.log(dataArr[j].name)
		}
	}
	// oSubmit.onclick = function() {
	// 	if (!dataArr.length) {
	// 		return alert('请先选择文件');
	// 	}
	// 	var form = $('#outlineBailPayForm');
    //     form.attr('action',"http://192.168.116.38:8080/upload");
    //     form.submit();
	// }
}