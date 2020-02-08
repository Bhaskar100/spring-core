package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	@Autowired
	B b;
	
	public void hello() {
		b.m1();
		System.out.println("HI");
	}

}
