package com.kiwolabs.recruiter;

import org.springframework.boot.SpringApplication;

public class TestRecruiterAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(RecruiterAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
