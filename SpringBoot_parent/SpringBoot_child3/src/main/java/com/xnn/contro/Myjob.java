package com.xnn.contro;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 类(接口)描述：
 * @author xnn
 * 2019年1月15日下午9:19:10
 */
@Component
public class Myjob {
	@Scheduled(fixedRate=1000)
public void run() {
	System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
}
}
