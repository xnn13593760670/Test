package com.xnn.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xnn.pojo.User;
import com.xnn.service.UserService;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午3:52:49
 */
@Controller
public class UserController {
	@Autowired
private UserService service;
	@RequestMapping("/save")
	@ResponseBody
	public String SaveUser() throws Exception {
		User user=new User();
		user.setUsername("小");
		user.setPassword("5464646");
		user.setEmail("444446@qq.com");
		user.setBirthday(new Date());
		service.addUser(user);
		return "ok";
	}
}
