package com.dompetqu.api.dompetquapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.dompetqu.api.dompetquapi")
@EnableJpaRepositories(basePackages = "com.dompetqu.api.dompetquapi.repository")
@EntityScan(basePackages = "com.dompetqu.api.dompetquapi.pojo")
public class DompetquapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DompetquapiApplication.class, args);
	}

}
