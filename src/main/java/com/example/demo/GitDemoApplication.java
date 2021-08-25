package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run= SpringApplication.run(GitDemoApplication.class, args);
		//changes for status2
		run.close();
	}

        //feature27 chenges
        public void raju(){
        System.out.println("Hello");
}
}
