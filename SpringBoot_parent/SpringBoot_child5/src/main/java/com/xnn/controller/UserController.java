package com.xnn.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xnn.pojo.TbUser;
import com.xnn.service.UserServiceImpl;


@Controller
public class UserController {
	@Autowired
private UserServiceImpl userservice;
	@RequestMapping("/save")
	@ResponseBody
	public String saveUser() {
		TbUser user = new TbUser();
		user.setUsername("xiaoming");
		user.setPassword("jzfkjgkihgjiks");
		user.setCreated(new Date());
		user.setUpdated(new Date());
		userservice.addUser(user);
		return "ok";
	}
	@RequestMapping("/find/{page}/{rows}")
	@ResponseBody
	public List<TbUser> findUser(@PathVariable int page, @PathVariable int rows){
		return userservice.findUser(page, rows);
	}
}
