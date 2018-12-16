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
}
