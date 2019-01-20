package org.SpringBoot_child;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月12日下午2:50:54
 */

@RestController
public class SpringBootController {
	@RequestMapping("hello")
	
public String rum() {
	return "Heelo World";
}
	@RequestMapping("/info/{msg}")
	public String show(@PathVariable(name="msg") String msg) 
	{
		return "show "+msg;
	}
}
