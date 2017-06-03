package com.test.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/poc")
public class PocController {

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public String index(Model model)  {
		return "index";
	}
}
