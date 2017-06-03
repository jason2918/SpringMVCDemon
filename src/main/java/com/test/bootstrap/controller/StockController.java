package com.test.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/stock")
public class StockController {

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public String mappingQuery(Model model) {
		return "queryStockData";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String mappingCreate(Model model) {
		return "createStockData";
	}
}
