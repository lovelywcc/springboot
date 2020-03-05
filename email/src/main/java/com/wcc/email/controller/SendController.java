package com.wcc.email.controller;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author wangcc
 * @create 2020-03-03 22:19
 **/
@Controller
@ResponseBody
@RequestMapping("mail")
public class SendController {
    @Resource//默认按照名称注入，@Resource没有找到名称时再找类型
    private MailSender mailSender;

    @RequestMapping("sendMail")
    public String sendMail(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1254534709@qq.com");
        message.setSubject("您好呀");
        message.setTo("1254534709@qq.com");//收件人地址
        message.setText("您本次的验证码为"+123455);
        mailSender.send(message);
        return "success";
    }
}
