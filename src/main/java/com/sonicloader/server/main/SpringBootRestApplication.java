package com.sonicloader.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication (scanBasePackages = {"com.sonicloader"})
@EnableCaching
public class SpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}
}
