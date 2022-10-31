package com.gl.fest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String sayhello() {
		return "index";
	}
	@RequestMapping("/Poulomi")
	public String sayHelloFromPoulomi() {
		return "poulomi";
	}
	@RequestMapping("/Random")
	public String sayHelloFromRandom() {
		return "random";
	}

}
