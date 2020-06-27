package com.caminha.democacheable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DemoCacheableApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCacheableApplication.class, args);
	}
}
