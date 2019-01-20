package com.xnn.app;

import java.nio.charset.Charset;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月19日下午1:24:33
 */
@SpringBootApplication(scanBasePackages= {"com.xnn"})
@MapperScan("com.xnn.mapper")
public class SpringTest {
public static void main(String[] args) {
	SpringApplication.run(SpringTest.class, args);
}
//定义消息转化器
	@Bean
	public StringHttpMessageConverter stringHttpMessageConverter() {
		StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
		return converter;
	}
}
