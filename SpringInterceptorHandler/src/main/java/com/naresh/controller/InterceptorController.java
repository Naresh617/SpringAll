package com.naresh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController 
{
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/hello")
	public String interceptor()
	{
		log.info("Welcome to access RequestMapping: /hello!");
		return "Hello Interceptor";
	}

}
