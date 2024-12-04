package com.cjc.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.controller.HubGitController;
import com.cjc.model.HubGit;
import com.cjc.repository.HubGitRepository;
import com.cjc.serviceI.HubGitServiceI;

@Service
public class HubGitServiceImpl implements HubGitServiceI
{
	private static final Logger LOG=LoggerFactory.getLogger(HubGitController.class);
	@Autowired HubGitRepository repository ;
	
	@Override
	public List<HubGit> saveData()
	{
		return (List<HubGit>) repository.findAll();
	}
	
	@Override
	public void saveData(HubGit h) 
	{
		repository.save(h);
	}
	
	

}
