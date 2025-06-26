package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@GetMapping("/displaydata")
	@ResponseBody
	public String display() {
		
		return "First application Arun it solutions";
		
	}
}
