package com.xnnemail;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午4:49:34
 */
@Controller
public class MailController {
	@Autowired
private EmailService emailService;
	@RequestMapping("/send")
	@ResponseBody
	public String  sendSimpleEmail() {
		
		emailService.senSimpleEmail("xu.nannan@neusoft.com", "你好", "测试邮件，请勿回复");
		return "ok";
	}
	@RequestMapping("/sendAttach")
	@ResponseBody
	public String  sendAttachmentEmail() {
		File file =new File("src/main/resources/public/简历 (1).doc");
		emailService.sendAttachmentMail("15393719325@163.com", "你好", "测试邮件，请勿回复",file);
		return "pk";

	}
}
