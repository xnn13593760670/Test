package com.xnn.service;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.xnn.pojo.TbUser;

/**
 * ��(�ӿ�)������
 * @author xnn
 * 2019��1��19������1:37:40
 */
public interface UserService {
    TbUser findUserByName(String name);
	void addUser(TbUser user);

}
