package com.demofing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients("com.demofing.feignclient")
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class DemofingnApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemofingnApplication.class, args);
	}

}
