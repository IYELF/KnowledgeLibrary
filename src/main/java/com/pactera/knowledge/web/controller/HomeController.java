package com.pactera.knowledge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pactera.knowledge.base.ApiResponse;

@Controller
public class HomeController {
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("name", "welcome");
		return "index";
	}
	
	@GetMapping("/test")
	@ResponseBody
	public ApiResponse test() {
		return ApiResponse.ofMessage(200, "AAAAAAA");
	}
}
