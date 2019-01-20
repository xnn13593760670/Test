package com.xnn.service;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.xnn.pojo.TbUser;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午1:37:40
 */
public interface UserService {
    TbUser findUserByName(String name);
	void addUser(TbUser user);

}
