package com.xnnemail;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午4:41:52
 */
@Component
public class EmailConfig {
	@Value("${spring.mail.username}")
private String emailFrom;

/**
 * @return the emailFrom
 */
public String getEmailFrom() {
	return emailFrom;
}

/**
 * @param emailFrom the emailFrom to set
 */
public void setEmailFrom(String emailFrom) {
	this.emailFrom = emailFrom;
}

}
