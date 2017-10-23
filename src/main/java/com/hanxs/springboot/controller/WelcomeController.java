package com.hanxs.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@RequestMapping("/") // Get any visitation by this route, no matter GET,
							// POST, DELETE, etc.
	public String hello() {
		logger.info("Get one visitor！");// 这里支持常见log的debug/info/warn/error等级别
		return "Welcome to my website!";
	}
}
