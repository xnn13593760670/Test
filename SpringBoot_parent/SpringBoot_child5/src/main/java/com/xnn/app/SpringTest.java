package com.xnn.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月17日下午9:16:33
 */
@SpringBootApplication(scanBasePackages="com.xnn")
@MapperScan("com.xnn.mapper")
public class SpringTest {
public static void main(String[] args) {
	SpringApplication.run(SpringTest.class, args);
}
}
