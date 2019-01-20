package com.xnn.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.xnn.pojo.TbUser;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午1:28:07
 */
public interface UserMapper {
	@Select("select * from tb_user where username=#{username}")
    TbUser findUserByName(/*@Param("name")*/ String name);
	@Insert("insert into tb_user(username ,password,created,updated) values (#{username},#{password},#{created},#{updated})")
	void addUser(@Param("username") String username,@Param("password") String password,@Param("created") Date created, @Param("updated")Date updated);
}
