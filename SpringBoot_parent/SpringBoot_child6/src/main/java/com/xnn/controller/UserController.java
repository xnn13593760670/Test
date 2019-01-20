package com.xnn.controller;

import java.nio.charset.Charset;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xnn.pojo.TbUser;
import com.xnn.service.UserService;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午1:44:21
 */
@Controller 
public class UserController {
	@Autowired
private UserService service ;
	@RequestMapping("/find")
	@ResponseBody
	public TbUser fimdUser(String name) {
		return service.findUserByName(name);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String addUser() {
	TbUser tbUser = new TbUser();
	tbUser.setUsername("张建");
	tbUser.setPassword("1245485");
	tbUser.setCreated(new Date());
	tbUser.setUpdated(new Date());
	service.addUser(tbUser);
	return "success ";
	}
	
	
}
