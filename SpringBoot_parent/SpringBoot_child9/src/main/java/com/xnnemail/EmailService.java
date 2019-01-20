package com.xnnemail;

import java.io.File;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午4:43:33
 */
public interface EmailService {
//发送简单的邮件
	void senSimpleEmail(String sendTo,String title,String conternt);
	//发送带附件的邮件
	void sendAttachmentMail(String sendTo,String title,String conternt,File file) ;
}
