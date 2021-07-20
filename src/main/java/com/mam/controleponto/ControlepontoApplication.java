package com.mam.controleponto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class ControlepontoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlepontoApplication.class, args);
	}
	
	
	@Bean
	public OpenAPI customOpenAPI( @Value("${spring.application.description}") String description ) {
		
		return new OpenAPI().info(new io.swagger.v3.oas.models.info.Info()
				.title(description)
				.version("1.0")
				.termsOfService("http://swagger.io/terms")
				.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
	

}
