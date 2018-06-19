package com.amanuel.timer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StopWatch {

	@RequestMapping("")
	public String home(Model model) {
		return "index";
	}
	@RequestMapping("/counter")
	public String counter(Model model) {
		return "counterPage";
	}
	@RequestMapping("/timer")
	public String timer(Model model) {
		return "timerPage";
	}
}
