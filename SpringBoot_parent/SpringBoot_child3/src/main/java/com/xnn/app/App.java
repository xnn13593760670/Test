package com.xnn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * ��(�ӿ�)������
 * @author xnn
 * 2019��1��15������9:17:14
 */
@SpringBootApplication(scanBasePackages= {"com.xnn"})
@EnableScheduling
public class App {
public static void main(String[] args) {
	SpringApplication.run(App.class, args);
}
}
