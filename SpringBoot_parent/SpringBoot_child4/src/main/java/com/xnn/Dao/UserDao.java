package com.xnn.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xnn.pojo.User;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月16日下午8:41:21
 */
@Repository
public class UserDao {
	@Autowired
private JdbcTemplate jdbcTemplate;
	public void addUser(User user) {
		jdbcTemplate.update("insert into t_user(id,username,password) values(?,?,?)", null,user.getUsername(),user.getPassword());
	}

}
