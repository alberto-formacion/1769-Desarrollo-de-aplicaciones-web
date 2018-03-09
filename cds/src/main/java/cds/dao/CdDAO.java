package cds.dao;

import java.util.List;

import cds.vo.Cd;

public interface CdDAO {
	
	public List<Cd> getCds();

	public void addCd(Cd cd);

}
