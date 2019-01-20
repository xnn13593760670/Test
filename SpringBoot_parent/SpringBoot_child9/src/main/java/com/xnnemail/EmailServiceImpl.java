package com.xnnemail;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jmx.export.assembler.SimpleReflectiveMBeanInfoAssembler;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午4:45:16
 */
@Service
public class EmailServiceImpl implements EmailService {
	@Autowired
private EmailConfig emailConfig;
	@Autowired
	
	private JavaMailSender mailSender;
	@Override
	public void senSimpleEmail(String sendTo, String title, String conternt) {
         //简单邮件的发送后
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(emailConfig.getEmailFrom());
		message.setSubject(title);
		message.setTo(sendTo);
		message.setText(conternt);
		mailSender.send(message);
	}
	@Override
	public void sendAttachmentMail(String sendTo, String title, String conternt,
			File file) {
  MimeMessage message  =mailSender.createMimeMessage();
  try {
	MimeMessageHelper helper =new MimeMessageHelper(message, true);
	helper.setFrom(emailConfig.getEmailFrom());
	helper.setTo(sendTo);
	helper.setSubject(title);
	helper.setText(conternt);
	FileSystemResource r = new FileSystemResource(file);
	helper.addAttachment("附件", r);
} catch (MessagingException e) {
	e.printStackTrace();
}
  mailSender.send(message);
	}  

}
