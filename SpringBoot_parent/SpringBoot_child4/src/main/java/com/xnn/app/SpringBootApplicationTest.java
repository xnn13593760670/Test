package com.xnn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月16日下午8:51:34
 */
@SpringBootApplication(scanBasePackages= {"com.xnn.Dao","com.xnn.service","com.xnn.Controller"})
public class SpringBootApplicationTest {
public static void main(String[] args) {
	SpringApplication.run(SpringBootApplicationTest.class, args);
}
}
