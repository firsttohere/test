package com.xzedu.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@GetMapping("/add")
	public String add() {
		System.out.println("正在执行add方法");
		System.out.println("hello world");
		System.out.println("hello github");
		return "成功";
	}
	
}
