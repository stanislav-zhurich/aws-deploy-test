package com.stan.aws.deploy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsDeployController {

	@RequestMapping("/")
	public String index() {
		return "Hi from Spring Boot!";
	}
	@RequestMapping("/health")
	public String healthCheck() {
		return "I'm healthy!";
	}
	
}
