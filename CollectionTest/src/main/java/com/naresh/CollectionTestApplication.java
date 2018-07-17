package com.naresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.bean.Demo;

@SpringBootApplication
public class CollectionTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionTestApplication.class, args);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("configure.xml");
		Demo db=(Demo) ctx.getBean("demoBean");
		db.showTheList();
		System.out.println("========================================");
		db.showTheMap();
	}
}
