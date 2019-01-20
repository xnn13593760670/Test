package com.xnn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xnn.Dao.UserDao;
import com.xnn.pojo.User;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月16日下午8:46:32
 */
@Service
public class UserService {
	@Autowired
private UserDao dao;
	@Transactional
public void save(User user) {
	dao.addUser(user);
	int i =1/0;
}
}
