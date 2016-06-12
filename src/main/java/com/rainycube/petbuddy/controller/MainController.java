package com.rainycube.petbuddy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(Controller.class);
	@RequestMapping("/")
	public String index(){
		System.out.println("/");
		return "index";
	}
	@RequestMapping("/test")
	public String test(){
		System.out.println("test");
		return "test";
	}
}
