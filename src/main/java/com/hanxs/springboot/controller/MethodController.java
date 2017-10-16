package com.hanxs.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethodController {

	@RequestMapping(value = "/get/{name}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String get(@RequestHeader(value = "token", required = true, defaultValue = "no token") String token,
			@PathVariable(value = "name") String name,
			@RequestParam(value = "age") int age){
		
		return "Get One visitor, \n"
				+ "name:" + name + "\n" 
				+ "age:" + age + "\n"
				+ "with token:" + token;
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public String post(@RequestBody String body){
		return body;
	}
}
