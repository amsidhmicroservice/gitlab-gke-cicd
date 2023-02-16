package com.amsidh.mvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@RestController
@RequestMapping("/app")
public class GitlabProjectDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GitlabProjectDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("GitlabProjectDemoApplication loaded successfully");
	}

	@GetMapping
	public String health() {
		return "{\"applicationName\":\"GitlabProjectDemoApplication\",\"status\":\"Up and Running\"}";
	}
}
