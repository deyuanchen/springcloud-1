package com.aotain.bootannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BootAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAnnotationApplication.class, args);
	}
}
