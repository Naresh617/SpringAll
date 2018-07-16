package com.naresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.bean.Movie;

@SpringBootApplication
public class SetterInjectionBasicConfiguarationApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(SetterInjectionBasicConfiguarationApplication.class, args);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Movie m=(Movie) ctx.getBean("movie");
		System.out.println("====================MovieDetails=======================");
		System.out.println(m);
		System.out.println("====================MovieDetailsEnd=======================");
		
	}
}
