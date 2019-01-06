package com.naresh.mvc.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController 
{
	@GetMapping("/")
	public String sayHello(Locale locale, Model model)
	{
		return "hello";
	}
}
