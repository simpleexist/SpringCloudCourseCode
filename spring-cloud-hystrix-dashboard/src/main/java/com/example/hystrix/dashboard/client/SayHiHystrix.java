package com.example.hystrix.dashboard.client;

import org.springframework.stereotype.Component;

@Component
public class SayHiHystrix implements SayHiClient {

	@Override
	public String sayHi(String name) {
		return "Hi, " + name + ". Sorry, ERROR!";
	}

}
