package com.xnn.test;

import org.SpringBoot_child.SpringBootController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import junit.framework.TestCase;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月12日下午2:54:51
 */
 @SpringBootTest(classes=SpringBootController.class)
 @RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestSpringcontroller {
	 @Autowired
private SpringBootController bootController;
	 @Test
	 public void test1() {
		 TestCase.assertEquals(this.bootController.rum(), "HeeloWorld");
	 }
}
