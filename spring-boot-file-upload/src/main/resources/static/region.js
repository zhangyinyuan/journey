//=======================================================
//============================公共=======================
//=======================================================
var now_url = window.location.href;
//var host = now_url.split("//")[1].split("/")[0];
var host1 = now_url.split("//")[1].split("/")[0];
var host2 = now_url.split("//")[1].split("/")[1];
var host = "http://"+host1+"/"+host2;
var urlStr = host+"/util/addressSelect/loadRegion.action";
//=======================================================

/*
 * 国家
 * (取得国家)
 * 
 * 参数:setCountryCdElementId  画面国下拉框元素代码Id
 * 参数:setCountryCd			       选中国代码
 * 参数:setCountryNmElementId  画面国下拉框元素名称Id
 * 参数:setCountryNm			       选中国名
 * 参数:loadNextFlg1  			是否有后续连动项
 * 参数:setProvinceCdElementId 	画面省下拉框元素代码Id
 * 参数:setProvinceCd		          选中省代码
 * 参数:setProvinceNmElementId 	画面省下拉框元素名称Id
 * 参数:setProvinceNm		          选中省名
 * 参数:loadNextFlg2  			是否有后续连动项
 * 参数:setCityCdElementId 		画面市下拉框元素代码Id
 * 参数:setCityCd		      	选中市代码
 * 参数:setCityNmElementId 		画面市下拉框元素名称Id
 * 参数:setCityNm		       	选中市名
 * 参数:loadNextFlg3  			是否有后续连动项
 * 参数:setAreaCdElementId 		画面区下拉框元素代码Id
 * 参数:setAreaCd		      	选中区代码
 * 参数:setAreaNmElementId 		画面区下拉框元素名称Id
 * 参数:setAreaNm		       	选中区名
 * 
 */
function autoCountry(setCountryCdElementId, 
		setCountryCd,
		setCountryNmElementId,
		setCountryNm,
		loadNextFlg1, 
		setProvinceCdElementId,
		setProvinceCd,
		setProvinceNmElementId,
		setProvinceNm,
		loadNextFlg2,
		setCityCdElementId,
		setCityCd,
		setCityNmElementId,
		setCityNm,
		loadNextFlg3,
		setAreaCdElementId,
		setAreaCd,
		setAreaNmElementId,
		setAreaNm) {
	
	// 国
	var mappingObj1 = document.getElementById(setCountryCdElementId);

	var dataStr = "addressType=country";
	$.getJSON(urlStr,dataStr,function(data){
		if(data.resultList != null){
			// 构造
			for (var j = 0; j < mappingObj1.options.length; j++) {
				mappingObj1.remove(mappingObj1.options[j]);
				j--;
			}
            var option = document.createElement("option");
            option.value = 'disp';
            var option_text = document.createTextNode('---请选择---');
            option.appendChild(option_text);
            mappingObj1.appendChild(option);
            
            $.each(data.resultList, function(i,item){
                var option = document.createElement("option");
                option.value = item[0];
                var option_text = document.createTextNode(item[1]);
                option.appendChild(option_text);
                mappingObj1.appendChild(option);
			});
            
            //赋予默认值
            if(setCountryCd !=null && setCountryCd !=""){
    			mappingObj1.value =setCountryCd;
    		}
            
    		// 连动--省
    		if(loadNextFlg1){
    			var mappingObj2 = document.getElementById(setProvinceCdElementId);
    			if (mappingObj1.value != null && mappingObj1.value != "") {
    				loadProvince(mappingObj1.value, 
    	            			mappingObj1.options[mappingObj1.selectedIndex].text, 
    	            			setProvinceCdElementId,
    	            			setProvinceCd,
    	            			setProvinceNmElementId,
    	            			setProvinceNm,
    	            			loadNextFlg2,
    	            			setCityCdElementId,
    	            			setCityCd,
    	            			setCityNmElementId,
    	            			setCityNm,
    	            			loadNextFlg3,
    	            			setAreaCdElementId,
    	            			setAreaCd,
    	            			setAreaNmElementId,
    	            			setAreaNm,
    	            			setCountryNmElementId);
    			} else {
    				for (var k = 0; k < mappingObj2.options.length; k++) {
    					mappingObj2.remove(mappingObj2.options[k]);
    					k--;
    				}
    				var mappingObj3 = document.getElementById(setCityCdElementId);
    				for (var k = 0; k < mappingObj3.options.length; k++) {
    					mappingObj3.remove(mappingObj3.options[k]);
    					k--;
    				}
    				var mappingObj4 = document.getElementById(setAreaCdElementId);
    				for (var k = 0; k < mappingObj4.options.length; k++) {
    					mappingObj4.remove(mappingObj4.options[k]);
    					k--;
    				}
    			}
    		}
		}
	});
}

/*
 * 省 
 * (取得国家下的省)
 * 
 * 参数:setProvinceCdElementId 	画面省下拉框元素代码Id
 * 参数:setProvinceCd		          选中省代码
 * 参数:setProvinceNmElementId 	画面省下拉框元素名称Id
 * 参数:setProvinceNm		          选中省名
 * 参数:loadNextFlg2  			是否有后续连动项
 * 参数:setCityCdElementId 		画面市下拉框元素代码Id
 * 参数:setCityCd		      	选中市代码
 * 参数:setCityNmElementId 		画面市下拉框元素名称Id
 * 参数:setCityNm		       	选中市名
 * 参数:loadNextFlg3  			是否有后续连动项
 * 参数:setAreaCdElementId 		画面区下拉框元素代码Id
 * 参数:setAreaCd		      	选中区代码
 * 参数:setAreaNmElementId 		画面区下拉框元素名称Id
 * 参数:setAreaNm		       	选中区名
 * 
 */
function autoProvince(setProvinceCdElementId, 
		setProvinceCd,
		setProvinceNmElementId, 
		setProvinceNm,
		loadNextFlg2,
		setCityCdElementId,
		setCityCd,
		setCityNmElementId,
		setCityNm,
		loadNextFlg3,
		setAreaCdElementId,
		setAreaCd,
		setAreaNmElementId,
		setAreaNm) {

	// 省
    var mappingObj2 = document.getElementById(setProvinceCdElementId);

	var dataStr = "addressType=province";
	$.getJSON(urlStr,dataStr,function(data){
		if(data.resultList != null){
			// 构造
			for (var j = 0; j < mappingObj2.options.length; j++) {
				mappingObj2.remove(mappingObj2.options[j]);
				j--;
			}
			var option = document.createElement("option");
            option.value = 'disp';
            var option_text = document.createTextNode('---请选择---');
            option.appendChild(option_text);
            mappingObj2.appendChild(option);
            $.each(data.resultList, function(i,item){
            	if(item[1]!=null&&item[1].replace(/(^\s*)|(\s*$)/g, "")!=''){
                var option = document.createElement("option");
                option.value = item[0];
                var option_text = document.createTextNode(item[1]);
                option.appendChild(option_text);
                mappingObj2.appendChild(option);
            	}
			});
            
            //赋予默认值
            if(setProvinceCd !=null && setProvinceCd !=""){
    			mappingObj2.value =setProvinceCd;
    			if(setProvinceNmElementId!=null && setProvinceNmElementId!=''){
    				var provinceNmObj = document.getElementById(setProvinceNmElementId);
    				provinceNmObj.value =setProvinceNm;
    			}
    		}
            
            // 连动--市
    	    if(loadNextFlg2){
    	        var mappingObj3 = document.getElementById(setCityCdElementId);
    	        if (mappingObj2.value != null && mappingObj2.value != "") {
    	        	loadCity(mappingObj2.value, 
    	        			mappingObj2.options[mappingObj2.selectedIndex].text, 
    	        			setCityCdElementId,
    	        			setCityCd,
    	        			setCityNmElementId,
    	        			setCityNm,
    	        			loadNextFlg3,
    	        			setAreaCdElementId,
    	        			setAreaCd,
    	        			setAreaNmElementId,
    	        			setAreaNm,
    	        			setProvinceNmElementId,
    	        			setProvinceNm);
    	        } else {
    	            for (var k = 0; k < mappingObj3.options.length; k++) {
    	            	mappingObj3.remove(mappingObj3.options[k]);
    	                k--;
    	            }
    	            var mappingObj4 = document.getElementById(setAreaCdElementId);
    				for (var k = 0; k < mappingObj4.options.length; k++) {
    					mappingObj4.remove(mappingObj4.options[k]);
    					k--;
    				}
    	        }
    	    }
		}
	});	
}

/*
 * 省 
 * (取得国家下的省)
 * 
 * 参数:inCountryCd    			选中的国家代码
 * 参数:inCountryNm    			选中的国家名称
 * 参数:setProvinceCdElementId 	画面省下拉框元素代码Id
 * 参数:setProvinceCd		          选中省代码
 * 参数:setProvinceNmElementId 	画面省下拉框元素名称Id
 * 参数:setProvinceNm		          选中省名
 * 参数:loadNextFlg2  			是否有后续连动项
 * 参数:setCityCdElementId 		画面市下拉框元素代码Id
 * 参数:setCityCd		      	选中市代码
 * 参数:setCityNmElementId 		画面市下拉框元素名称Id
 * 参数:setCityNm		       	选中市名
 * 参数:loadNextFlg3  			是否有后续连动项
 * 参数:setAreaCdElementId 		画面区下拉框元素代码Id
 * 参数:setAreaCd		      	选中区代码
 * 参数:setAreaNmElementId 		画面区下拉框元素名称Id
 * 参数:setAreaNm		       	选中区名
 * 参数:setCountryNmElementId	画面国元素名称Id
 * 
 */
function loadProvince(inCountryCd, 
		inCountryNm, 
		setProvinceCdElementId, 
		setProvinceCd,
		setProvinceNmElementId, 
		setProvinceNm,
		loadNextFlg2,
		setCityCdElementId,
		setCityCd,
		setCityNmElementId,
		setCityNm,
		loadNextFlg3,
		setAreaCdElementId,
		setAreaCd,
		setAreaNmElementId,
		setAreaNm,
		setCountryNmElementId) {

	if(setCountryNmElementId!=null && setCountryNmElementId!=''){
		document.getElementById(setCountryNmElementId).value=inCountryNm;
	}
	
	// 省
	var mappingObj2 = document.getElementById(setProvinceCdElementId);

	var dataStr = "addressType=province&paramsInValue=" + inCountryCd;
	$.getJSON(urlStr,dataStr,function(data){
		if(data.resultList != null){		
			// 构造
			for (var j = 0; j < mappingObj2.options.length; j++) {
            	mappingObj2.remove(mappingObj2.options[j]);
                j--;
            }
            $.each(data.resultList, function(i,item){
                var option = document.createElement("option");
                option.value = item[0];
                var option_text = document.createTextNode(item[1]);
                option.appendChild(option_text);
                mappingObj2.appendChild(option);
			});
            
            //赋予默认值
            if(setProvinceCd !=null && setProvinceCd !=""){
    			mappingObj2.value =setProvinceCd;
    		}
            
            // 连动--市
            if(loadNextFlg2){
                var mappingObj3 = document.getElementById(setCityCdElementId);
                if (mappingObj2.value != null && mappingObj2.value != "") {
                	loadCity(mappingObj2.value, 
                			mappingObj2.options[mappingObj2.selectedIndex].text, 
                			setCityCdElementId,
                			setCityCd,
                			setCityNmElementId,
                			setCityNm,
                			loadNextFlg3,
                			setAreaCdElementId,
                			setAreaCd,
                			setAreaNmElementId,
                			setAreaNm,
                			setProvinceNmElementId);
                } else {
                    for (var k = 0; k < mappingObj3.options.length; k++) {
                    	mappingObj3.remove(mappingObj3.options[k]);
                        k--;
                    }
                    var mappingObj4 = document.getElementById(setAreaCdElementId);
    				for (var k = 0; k < mappingObj4.options.length; k++) {
    					mappingObj4.remove(mappingObj4.options[k]);
    					k--;
    				}
                }
            }
		}
	});
}

/*
 * 市
 * (取得省份下的市)
 * 
 * 参数:inProvinceCd    		选中的省代码
 * 参数:inProvinceNm    		选中的省名称
 * 参数:setCityCdElementId 		画面市下拉框元素代码Id
 * 参数:setCityCd		      	选中市代码
 * 参数:setCityNmElementId 		画面市下拉框元素名称Id
 * 参数:setCityNm		       	选中市名
 * 参数:loadNextFlg3  			是否有后续连动项
 * 参数:setAreaCdElementId 		画面区下拉框元素代码Id
 * 参数:setAreaCd		      	选中区代码
 * 参数:setAreaNmElementId 		画面区下拉框元素名称Id
 * 参数:setAreaNm		       	选中区名
 * 参数:setProvinceNmElementId	画面省元素名称Id
 * 
 */
function loadCity(inProvinceCd, 
		inProvinceNm, 
		setCityCdElementId,
		setCityCd,
		setCityNmElementId,
		setCityNm,
		loadNextFlg3,
		setAreaCdElementId,
		setAreaCd,
		setAreaNmElementId,
		setAreaNm,
		setProvinceNmElementId) {
	if(setProvinceNmElementId!=null && setProvinceNmElementId!=''){
		document.getElementById(setProvinceNmElementId).value=inProvinceNm;
	}
	
	// 市
	var mappingObj3 = document.getElementById(setCityCdElementId);

	var dataStr = "addressType=city&paramsInValue=" + inProvinceCd;
	$.getJSON(urlStr,dataStr,function(data){
		if(data.resultList != null){
			// 构造
			for (var j = 0; j < mappingObj3.options.length; j++) {
				mappingObj3.remove(mappingObj3.options[j]);
                j--;
            }
	            
            $.each(data.resultList, function(i,item){
                var option = document.createElement("option");
                option.value = item[0];
                var option_text = document.createTextNode(item[1]);
                option.appendChild(option_text);
                mappingObj3.appendChild(option);
			});
            
            //-------------
            if(!loadNextFlg3){
            	var option = document.createElement("option");
                option.value = " ";
                var option_text = document.createTextNode("全部");
                option.appendChild(option_text);
                mappingObj3.appendChild(option);
            }
            //-------------
            
            //赋予默认值
            if(setCityCd !=null && setCityCd !=""){
    			mappingObj3.value =setCityCd;
    		}else{
    			mappingObj3.value =" ";
    		}
            
            // 连动--区 
            if(loadNextFlg3){
                var mappingObj4 = document.getElementById(setAreaCdElementId);
                if (mappingObj3.value != null && mappingObj3.value != "") {
                	loadArea(mappingObj3.value, 
                			mappingObj3.options[mappingObj3.selectedIndex].text, 
                			setAreaCdElementId,
                			setAreaCd,
                			setAreaNmElementId,
                			setAreaNm,
                			setCityNmElementId);
                } else {
                    for (var k = 0; k < mappingObj4.options.length; k++) {
                    	mappingObj4.remove(mappingObj4.options[k]);
                        k--;
                    }
                }
            }
		}
	});
}

/*
 * 区
 * (取得市下的区)
 * 
 * 参数:inCityCd    			选中的市代码
 * 参数:inCityNm    			选中的市名称
 * 参数:setAreaCdElementId 		画面区下拉框元素代码Id
 * 参数:setAreaCd		      	选中区代码
 * 参数:setAreaNmElementId 		画面区下拉框元素名称Id
 * 参数:setAreaNm		       	选中区名
 * 参数:setCityNmElementId 		画面市元素名称Id
 * 
 */
function loadArea(inCityCd, 
		inCityNm, 
		setAreaCdElementId,
		setAreaCd,
		setAreaNmElementId,
		setAreaNm,
		setCityNmElementId) {

	if(setCityNmElementId!=null && setCityNmElementId!=''){
		document.getElementById(setCityNmElementId).value=inCityNm;
	}

	// 区
	 var mappingObj4 = document.getElementById(setAreaCdElementId);

	var dataStr = "addressType=area&paramsInValue=" + inCityCd;
	$.getJSON(urlStr,dataStr,function(data){
		if(data.resultList != null){
			// 构造
			for (var j = 0; j < mappingObj4.options.length; j++) {
				mappingObj4.remove(mappingObj4.options[j]);
                j--;
            }
	            
            $.each(data.resultList, function(i,item){
                var option = document.createElement("option");
                option.value = item[0];
                var option_text = document.createTextNode(item[1]);
                option.appendChild(option_text);
                mappingObj4.appendChild(option);
			});
            
            //赋予默认值
            if(setAreaCd !=null && setAreaCd !=""){
    			mappingObj4.value =setAreaCd;
    		}
            
            // 街道
            if(mappingObj4!=null && mappingObj4.options.length>0){
	        	loadAreaSelf(mappingObj4.value, mappingObj4.options[mappingObj4.selectedIndex].text, setAreaNmElementId);
	            /*
	            if(loadNextFlg){
	                var mappingObj5 = document.getElementById(nextElementCdId);// post
	                if (mappingObj4.value != null && mappingObj4.value != "") {
	                	loadAreaNext(mappingObj4.value, mappingObj4.options[mappingObj4.selectedIndex].text, true);
	                } else {
	                    for (var k = 0; k < mappingObj5.options.length; k++) {
	                    	mappingObj5.remove(mappingObj5.options[k]);
	                        k--;
	                    }
	                }
	            }
	            */
            }
		}
	});
}

/*
 * 区--->下一级
 * 
 * 参数:inAreaCd    			选中的区代码
 * 参数:inAreaNm    			选中的区名称
 * 参数:setAreaNmElementId 		画面区元素名称Id
 * 
 */
function loadAreaSelf(inAreaCd, inAreaNm, setAreaNmElementId) {
	document.getElementById(setAreaNmElementId).value=inAreaNm;
}
