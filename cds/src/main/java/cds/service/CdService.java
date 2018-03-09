package cds.service;

import java.util.List;

import cds.vo.Cd;

public interface CdService {

	public List<Cd> getCds();
	
	public void addCd(Cd cd);
	
}
