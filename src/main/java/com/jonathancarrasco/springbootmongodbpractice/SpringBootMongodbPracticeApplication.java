package com.jonathancarrasco.springbootmongodbpractice;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongock
public class SpringBootMongodbPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbPracticeApplication.class, args);
	}

}
