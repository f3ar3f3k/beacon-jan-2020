package com.beacon.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BeaconController {

	@RequestMapping("/")
	public String getWelcomePage() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public ModelAndView sayHelloWorld() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("message", "Hello World!");
		mv.setViewName("hello");
		
		return mv;
	}
	
	@RequestMapping("/display")
	public String displayDetails(Model model) {
		
		model.addAttribute("yourName", "I'm Lej.");
		model.addAttribute("yourAge", "18 yrs old!");
		
		return "display";
		
	}
}
