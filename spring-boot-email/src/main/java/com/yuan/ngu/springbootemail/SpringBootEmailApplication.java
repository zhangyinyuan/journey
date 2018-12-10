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
import javax.mail.internet.MimeMessage;

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
            helper.setFrom(Sender);
            //邮件接收人
            helper.setTo(new String[]{"zhangyinyuan@aliyun.com", "zhangyinyuan@ule.com"});
            //抄送邮件接收人
            helper.setCc(reciver);
            helper.setBcc("2602200571@qq.com");
            helper.setSubject("发送带抄送的邮件");//邮件标题
            helper.setText("<html><body> <h3>我是邮件的内容</h3></body></html>", true);//可以使用html
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return "发送邮件成功";
    }
}
