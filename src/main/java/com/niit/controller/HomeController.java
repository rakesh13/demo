package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = {"/","/index"})
	public String homePage()
	{
		return "index";
	}
	
	@GetMapping("/success")
	public String successPage(Model model)
	{
		model.addAttribute("name", "Rakesh");
		return "success";
	}
}
