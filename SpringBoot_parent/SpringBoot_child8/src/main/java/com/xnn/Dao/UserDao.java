package com.xnn.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xnn.pojo.User;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午3:34:09
 */
public interface UserDao extends JpaRepository<User, Integer>{

}
