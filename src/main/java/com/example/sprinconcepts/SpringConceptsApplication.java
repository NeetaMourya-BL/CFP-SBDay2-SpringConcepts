package com.example.sprinconcepts;

import com.example.sprinconcepts.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		System.out.println("Checking Context: " +context.getBean(DemoBean.class));
	
	}

}
