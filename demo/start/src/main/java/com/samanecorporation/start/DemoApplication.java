package com.samanecorporation.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.samanecorporation")
@EnableJpaRepositories(basePackages = {"com.samanecorporation.adapter.repository.business"})
@EntityScan(basePackages = "com.samanecorporation.adapter.repository.business.entity")
@ComponentScan(basePackages = { "com.samanecorporation.adapter.api", "com.samanecorporation.domaine.service","com.samanecorporation.adapter.repository.business.client","com.samanecorporation.domaine.mapper","com.samanecorporation.adapter.repository.business.client"})
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
