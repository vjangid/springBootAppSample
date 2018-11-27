package com.dcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DcfApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcfApplication.class, args);
	}
}
