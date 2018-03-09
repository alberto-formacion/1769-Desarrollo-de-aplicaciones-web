package cds.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cds.dao.CdDAO;
import cds.vo.Cd;

@Repository
public class HibernateCdDAO implements CdDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional(readOnly=true)
	public List<Cd> getCds() {
		
		Query q = sessionFactory.getCurrentSession().createQuery("from Cd");
		
		return q.getResultList();
	}

	@Transactional(readOnly=false)
	public void addCd(Cd cd) {
		sessionFactory.getCurrentSession().save(cd);
	}

}
