package com.xnn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ��(�ӿ�)������
 * @author xnn
 * 2019��1��16������8:51:34
 */
@SpringBootApplication(scanBasePackages= {"com.xnn.Dao","com.xnn.service","com.xnn.Controller"})
public class SpringBootApplicationTest {
public static void main(String[] args) {
	SpringApplication.run(SpringBootApplicationTest.class, args);
}
}
