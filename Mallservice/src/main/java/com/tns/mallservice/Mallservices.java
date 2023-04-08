package com.tns.mallservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class Mallservices {
	@Autowired
	private MallServicesRepository repo;
	public List <Mall>listAll()
	{
		return repo.findAll();
	}
	public Mall get(Integer Mall_id)
	{
		return repo.findById(Mall_id).get();
	}
	public void delete(Integer Mall_id)
	{
		repo.deleteById(Mall_id);
	}
	public void save(Mall mls)
	{
		repo.save(mls);
	}

}



