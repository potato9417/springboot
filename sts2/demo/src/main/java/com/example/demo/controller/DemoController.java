package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DemoController {
	
	@GetMapping("/")
	public String demo(Model model) {
		
		log.info("sts demo");
		model.addAttribute("arg", "인자");
		
		return "demo";
	}

}
