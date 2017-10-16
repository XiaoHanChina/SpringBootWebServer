package com.hanxs.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/")//Get any visitation by this route, no matter GET, POST, DELETE, etc.
	public String hello() {
		return "Welcome to my website!";
	}
}
