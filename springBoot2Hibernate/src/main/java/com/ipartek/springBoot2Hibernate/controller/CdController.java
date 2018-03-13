package com.ipartek.springBoot2Hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipartek.springBoot2Hibernate.domain.Cd;
import com.ipartek.springBoot2Hibernate.service.CdService;

@RestController
@RequestMapping("/cds")
public class CdController {
	
	@Autowired
	CdService cdService;

	@GetMapping
	public List<Cd> getCds(){
		return cdService.getCds();
	}
}
