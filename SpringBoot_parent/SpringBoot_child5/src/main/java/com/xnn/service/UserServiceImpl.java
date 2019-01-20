package com.xnn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.xnn.mapper.TbUserMapper;
import com.xnn.pojo.TbUser;
import com.xnn.pojo.TbUserExample;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月16日下午11:08:11
 */
@Service
public class UserServiceImpl {
	@Autowired
	private TbUserMapper mapper;
//添加用户
	public void addUser(TbUser tbUser) {
		mapper.insert(tbUser);
	}
	//分页查找
public	List<TbUser> findUser(int page, int rows){
		TbUserExample example = new TbUserExample();
		PageHelper.startPage(page,rows);
		List<TbUser> selectByExample = mapper.selectByExample(example);
		return selectByExample;
		
	}
}
