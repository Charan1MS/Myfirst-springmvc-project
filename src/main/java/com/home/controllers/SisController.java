package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {
	@ResponseBody
	@RequestMapping("/makeupkit")
	public String giveMakeupKit() {
		return "Hi...Here is your Makeup Kit";
	}

}
