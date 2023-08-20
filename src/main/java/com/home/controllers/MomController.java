package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Momclass")
public class MomController {
	
	@RequestMapping("/sugar")
	public String giveSugar() {
		return "Sugar";
	}
	
	
	@RequestMapping("/books")
	public String getBooks() {
		return "MathBook";
	}
}
