package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {
	@ResponseBody
	@RequestMapping("/cricketbat")
	public String getCricketBat() {
		return "Hey.,Here is your Cricket bat...";
	}

}
