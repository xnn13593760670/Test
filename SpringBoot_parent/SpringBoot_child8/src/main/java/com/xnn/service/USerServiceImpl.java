package com.xnn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xnn.Dao.UserDao;
import com.xnn.pojo.User;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午3:36:48
 */
@Service
public class USerServiceImpl implements UserService {
   @Autowired
	private UserDao dao;
	@Override
	public void addUser(User user) {
		dao.save(user);
	}

}
