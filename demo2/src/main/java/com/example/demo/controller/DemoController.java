package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DemoController {
	
	@GetMapping("/")
	public String demo(Model model) {
		
		log.info("boot start");
		model.addAttribute("cat", "데이");
		
		return "home";
	}

}
