package com.ipartek.springBoot2Hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inicio")
public class HomeController {

	@GetMapping
	public String inicio() {
		return "hola";
	}
}
