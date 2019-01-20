package com.xnn.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ��(�ӿ�)������
 * @author xnn
 * 2019��1��17������9:16:33
 */
@SpringBootApplication(scanBasePackages="com.xnn")
@MapperScan("com.xnn.mapper")
public class SpringTest {
public static void main(String[] args) {
	SpringApplication.run(SpringTest.class, args);
}
}
