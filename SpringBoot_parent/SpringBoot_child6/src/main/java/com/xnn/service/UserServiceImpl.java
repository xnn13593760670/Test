 package com.xnn.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xnn.mapper.UserMapper;
import com.xnn.pojo.TbUser;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午1:39:03
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
  private UserMapper mapper;
	@Override
	public TbUser findUserByName(String name) {
		return  mapper.findUserByName(name);
		
	}

	@Override
	public void addUser(TbUser user) {
              mapper.addUser(user.getUsername(), user.getPassword(), user.getCreated(), user.getUpdated());
	}

}
