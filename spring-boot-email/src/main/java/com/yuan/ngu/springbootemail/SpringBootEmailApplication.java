package com.yuan.ngu.springbootemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@RestController
public class SpringBootEmailApplication {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String Sender;
    @Value("zhangyinyuan@aliyun.com")
    private String reciver;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEmailApplication.class, args);
    }

    @RequestMapping(path = "/testSendEmail")
    public Object testSendEmail() {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom(Sender);
//        message.setTo(reciver);
//        message.setSubject("主题：简单邮件");
//        message.setText("测试邮件内容");
//        mailSender.send(message);
//        System.out.println("发送邮件成功");

        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper;
        try {
            helper = new MimeMessageHelper(mimeMessage, true);
            //发送人
//            helper.setFrom(Sender);
            mimeMessage.setFrom(new InternetAddress(Sender, "发票数据", "UTF-8"));
            //邮件接收人
            helper.setTo(new String[]{"zhangyinyuan@aliyun.com", "zhangyinyuan@ule.com"});
            //抄送邮件接收人
            helper.setCc(reciver);
            helper.setBcc("2602200571@qq.com");
            //邮件主题
            helper.setSubject("电子发票统计数据");
            helper.setText("<!DOCTYPE html>\n" +
                    "<html lang=\"zh\">\n" +
                    "\t<head>\n" +
                    "\t\t<meta charset=\"UTF-8\">\n" +
                    "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                    "\t\t<title>Document</title>\n" +
                    "\t</head>\n" +
                    "\t<body>\n" +
                    "\t\t<div>\n" +
                    "\t\t\t<h2>以下为 <span style=\"color: blue;\">11月28日</span> 的发票统计数据：</h2>\n" +
                    "\t\t\t<ul>\n" +
                    "\t\t\t\t<li>申请开票金额: 123</li>\n" +
                    "\t\t\t\t<li>申请开票数量: 123</li>\n" +
                    "\t\t\t\t<li>已开票金额: 123</li>\n" +
                    "\t\t\t\t<li>已开票数量: 123</li>\n" +
                    "\t\t\t\t<li>已开票中补开票金额: 123</li>\n" +
                    "\t\t\t\t<li>已开票中补开票数量: 123</li>\n" +
                    "\t\t\t</ul>\n" +
                    "\t\t</div>\n" +
                    "\t</body>\n" +
                    "</html>", true);//可以使用html
            mailSender.send(mimeMessage);
        } catch (MessagingException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "发送邮件成功";
    }

    @RequestMapping(path = "/testSendEmail2")
    public Object testSendEmail2() {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper;
        try {
            helper = new MimeMessageHelper(mimeMessage, true);
            mimeMessage.setFrom(new InternetAddress(Sender, "邮乐零售结算组", "UTF-8"));
            //邮件接收人
            helper.setTo(new String[]{"zhangyinyuan@ule.com"});
            //抄送邮件接收人
            helper.setCc(reciver);
            //邮件主题
            helper.setSubject("[ 平台结算 2019年02月22日 ] 订单消息推送对账汇总");
            StringBuffer sbcontext = new StringBuffer();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
            sbcontext.append("<h1> <font color=\"green\"><b>2019年02月22日对账以下数据有异常：</b></font> </h1> <h3> <font color=green><b>大网支付订单推送差异：</b></font> <font color=red> 6条</font> </h3> <h3> <font color=green><b>3101支付订单推送差异：</b></font> <font color=red> 9条</font> </h3> <h3> <font color=green><b>签收订单推送差异：</b></font> <font color=red> 2条</font> </h3> <h3> <font color=green><b>退款订单推送差异：</b></font> <font color=red> 1条</font> </h3> <div style=\"color: green;\"><label>查看明细（点击链接地址，打开对账单明细页面）</label><a href=\"http://cs.ule.com/pcsCmsWeb/commissionUnusual/queryAll\">http://cs.ule.com/pcsCmsWeb/commissionUnusual/queryAll</a></div> <br /> <hr /> <h3> <font color=red><b>2019年02月21日，零售平台大网支付订单推送数据对账结果</b></font> </h3> <h3> <font color=green><b>应推数： 38312条，实推数：38312条，应推与实推差异订单数：0条。</b></font> </h3> <h3> <font color=green><b>落地数： 38312条，落地成功数：38312条，落地异常数：0条。</b></font> </h3> <h3> <font color=green><b>落地异常订单列表：</b></font> </h3> <h3> <font color=green><b>补推数： 0，补推落地数：0条，补推落地成功数：0条，补推落地异常数：0条。</b></font> </h3> <h3> <font color=green><b>补推订单列表：</b></font> </h3> <h3> <font color=green><b>补推落地异常订单列表：</b></font> </h3> <br /> <h3> <font color=red><b>2019年02月21日，零售平台签收订单推送数据对账结果：</b></font> </h3> <h3> <font color=green><b>应推数： 38312条，实推数：38312条，应推与实推差异订单数：0条。</b></font> </h3> <h3> <font color=green><b>落地数： 38312条，落地成功数：38312条，落地异常数：0条。</b></font> </h3> <h3> <font color=green><b>落地异常订单列表：</b></font> </h3> <h3> <font color=green><b>补推数： 0，补推落地数：0条，补推落地成功数：0条，补推落地异常数：0条。</b></font> </h3> <h3> <font color=green><b>补推订单列表：</b></font> </h3> <h3> <font color=green><b>补推落地异常订单列表：</b></font> </h3> <br /> <h3> <font color=red><b>2019年02月21日，零售平台退款订单推送数据对账结果：</b></font> </h3> <h3> <font color=green><b>应推数： 38312条，实推数：38312条，应推与实推差异订单数：0条。</b></font> </h3> <h3> <font color=green><b>落地数： 38312条，落地成功数：38312条，落地异常数：0条。</b></font> </h3> <h3> <font color=green><b>落地异常订单列表：</b></font> </h3> <h3> <font color=green><b>补推数： 0，补推落地数：0条，补推落地成功数：0条，补推落地异常数：0条。</b></font> </h3> <h3> <font color=green><b>补推订单列表：</b></font> </h3> <h3> <font color=green><b>补推落地异常订单列表：</b></font> </h3> <br /> <h3> <font color=red><b>2019年02月21日，零售平台退款订单推送数据对账结果：</b></font> </h3> <h3> <font color=green><b>应推数： 38312条，实推数：38312条，应推与实推差异订单数：0条。</b></font> </h3> <h3> <font color=green><b>落地数： 38312条，落地成功数：38312条，落地异常数：0条。</b></font> </h3> <h3> <font color=green><b>落地异常订单列表：</b></font> </h3> <h3> <font color=green><b>补推数： 0，补推落地数：0条，补推落地成功数：0条，补推落地异常数：0条。</b></font> </h3> <h3> <font color=green><b>补推订单列表：</b></font> </h3> <h3> <font color=green><b>补推落地异常订单列表：</b></font> </h3> <br />");
            helper.setText(sbcontext.toString(), true);
            mailSender.send(mimeMessage);
        } catch (MessagingException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "发送邮件成功";
    }
}
