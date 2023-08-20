package com.home.mom.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MomcafeController {
	@RequestMapping("/momcafe")
	public String cafe(Model model) {
		String name="Charan Raj MS";
		String heading="Mom's cafe";
		model.addAttribute("Myname",name);
		model.addAttribute("Pageheading", heading);
		return "welcome-page";
	}
    @RequestMapping("/processorder")
	public String processOrder(HttpServletRequest request,Model model) {
    	String userInput=request.getParameter("foodtype");
    	model.addAttribute("userInput", userInput);
		return "processorder";
	}
}
