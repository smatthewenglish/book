package com.jpmchase.onyx.meriwether;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.jpmchase.onyx.meriwether.model")
@EnableJpaRepositories("com.jpmchase.onyx.meriwether.repository")
public class MeriwetherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeriwetherApplication.class, args);
	}

}
