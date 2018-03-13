package com.ipartek.springBoot2Hibernate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.springBoot2Hibernate.domain.Cd;
import com.ipartek.springBoot2Hibernate.repository.CdRepository;
import com.ipartek.springBoot2Hibernate.service.CdService;

@Service
public class CdServiceImpl implements CdService{
	
	@Autowired
	CdRepository cdRepository;

	@Override
	public List<Cd> getCds() {
		return cdRepository.findAll();
	}

}
