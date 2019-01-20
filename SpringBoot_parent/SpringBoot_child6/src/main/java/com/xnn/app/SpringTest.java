package com.xnn.app;

import java.nio.charset.Charset;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;

/**
 * ��(�ӿ�)������
 * @author xnn
 * 2019��1��19������1:24:33
 */
@SpringBootApplication(scanBasePackages= {"com.xnn"})
@MapperScan("com.xnn.mapper")
public class SpringTest {
public static void main(String[] args) {
	SpringApplication.run(SpringTest.class, args);
}
//������Ϣת����
	@Bean
	public StringHttpMessageConverter stringHttpMessageConverter() {
		StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
		return converter;
	}
}
