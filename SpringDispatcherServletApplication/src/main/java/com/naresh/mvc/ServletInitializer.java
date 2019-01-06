package com.naresh.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringDispatcherServletApplication.class);
	}
	
	public static void  main(String args[]) throws Exception
	{
		SpringApplication.run(SpringDispatcherServletApplication.class, args);
	}

}
