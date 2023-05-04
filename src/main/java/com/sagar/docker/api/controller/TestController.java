package com.sagar.docker.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("message")
	public String getMessage() {
		return "Welcome Hero";
	}
}
