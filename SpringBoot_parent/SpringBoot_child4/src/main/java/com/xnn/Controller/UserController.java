package com.xnn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xnn.pojo.User;
import com.xnn.service.UserService;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月16日下午8:48:15
 */
@Controller
public class UserController {
	 @Autowired
	 private UserService service;
	 @RequestMapping("/save")
	 @ResponseBody
public String save() {
	service.save(new User("zhangsan2","1234567878999"));
	return "success";
}
}
