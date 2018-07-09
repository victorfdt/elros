package com.elros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ElrosController {

	@RequestMapping(value="/")
    public String index() {
        return "index";
    }
	
	@RequestMapping(value="/about")
    public String about() {
        return "about";
    }
}
