package com.myFirstSprBootProj.Spring.basics.Springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@ComponentScan({"com.myFirstSprBootProj.Spring.compScan", "com.myFirstSprBootProj.Spring.basics.Springin5steps"})
public class SpringIn5StepsApplication {
	public static void main(String[] args) {
		//BinarySearchImpl bsi = new BinarySearchImpl(new QuickSortAlgorithm());
		//BinarySearchImpl bsi = new BinarySearchImpl(new BubbleSortAlgorithm());
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class);
		BinarySearchImpl bsi = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl bsi2 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println("bsi => "+bsi+"bsi2 => "+bsi2);
		bsi.binarySearch();
	}

}
