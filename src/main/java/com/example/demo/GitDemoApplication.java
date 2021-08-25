package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run= SpringApplication.run(GitDemoApplication.class, args);
		run.close();
	}

}
