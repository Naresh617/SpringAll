package com.naresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.code.MovieLister;

@SpringBootApplication
public class AutowireApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutowireApplication.class, args);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationConfig.xml");
		MovieLister lister=(MovieLister) ctx.getBean("lister");
		lister.printMovieByYear();
	}
}
