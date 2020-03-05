package com.wcc.email.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @author wangcc
 * @create 2020-03-03 21:18
 **/
@Configuration
public class MialConfig {
    @Bean
    public MailSender mailSender(){
        //MailSender mailSend = new JavaMailSenderImpl();
        //第一次写作上面这种形式，返回的是接口，里面没有属性并没有set方法
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.qq.com");//指定用来发送端口的邮件服务器主机名
        mailSender.setPort(587);//默认端口，标准的smtp端口
        mailSender.setPassword("cnfeyhkrrlqnighi");//qq必须通过这种授权码的形式发送邮件
        mailSender.setDefaultEncoding("utf8");
        mailSender.setUsername("1254534709@qq.com");//用户名
        return mailSender;
    }
}
