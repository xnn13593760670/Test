package com.xnn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午3:57:27
 */
@SpringBootApplication(scanBasePackages= {"com.xnn"})
@EntityScan("com.xnn.pojo")//扫描实体类
@EnableJpaRepositories("com.xnn.Dao")//扫描Dao
public class SpringTest {
public static void main(String[] args) {
	SpringApplication.run(SpringTest.class, args);
}
}
