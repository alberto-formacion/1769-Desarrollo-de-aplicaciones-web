package cds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cds.dao.CdDAO;
import cds.service.CdService;
import cds.vo.Cd;

@Service
public class CdServiceImpl implements CdService {
	
	@Autowired
	CdDAO cdDAO;

	public List<Cd> getCds() {
		return cdDAO.getCds();
	}

	public void addCd(Cd cd) {
		cdDAO.addCd(cd);
	}

}
