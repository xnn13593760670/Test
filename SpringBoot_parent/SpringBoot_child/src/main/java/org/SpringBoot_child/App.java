package org.SpringBoot_child;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
// 	@EnableAutoConfiguration
//@ComponentScan("org.SpringBoot_child")
@SpringBootApplication
//(scanBasePackages= {"org.SpringBoot_child"})
public class App 
{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
