package com.example.demoMaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DemoController {

	@GetMapping
	public String demo(Model model) {
		
		log.info("maven start");
		model.addAttribute("arg","인자");
		
		return "home";
	}
}
