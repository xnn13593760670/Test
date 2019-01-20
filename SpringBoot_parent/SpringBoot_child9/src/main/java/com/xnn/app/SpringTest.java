package com.xnn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * 绫�(鎺ュ彛)鎻忚堪锛�
 * @author xnn
 * 2019骞�1鏈�19鏃ヤ笅鍗�3:57:27
 */
@SpringBootApplication(scanBasePackages= {"com.xnnemail"})
public class SpringTest {
public static void main(String[] args) {
	SpringApplication.run(SpringTest.class, args);
}
}
