package com.example.SpringDockerKubernatesExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.example.SpringDockerKubernatesExample.entity")
@ComponentScan(basePackages = {"com.example.SpringDockerKubernatesExample"})
public class SpringDockerKubernatesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerKubernatesExampleApplication.class, args);
	}

}
