package com.xnn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xnn.Dao.UserDao;
import com.xnn.pojo.User;

/**
 * ��(�ӿ�)������
 * @author xnn
 * 2019��1��16������8:46:32
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
