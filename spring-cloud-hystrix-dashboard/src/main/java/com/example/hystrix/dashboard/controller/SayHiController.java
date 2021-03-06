package com.example.hystrix.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hystrix.dashboard.service.SayHiService;

@RestController
public class SayHiController {
	@Autowired
	SayHiService sayHiService;
	
	@RequestMapping("/hi")
	public String sayHi(@RequestParam String name) {
		return sayHiService.sayHi(name);
	}
}
