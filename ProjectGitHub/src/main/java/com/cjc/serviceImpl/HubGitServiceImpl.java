package com.cjc.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.controller.HubGitController;
import com.cjc.repository.HubGitRepository;
import com.cjc.serviceI.HubGitServiceI;

@Service
public class HubGitServiceImpl implements HubGitServiceI
{
	private static final Logger LOG=LoggerFactory.getLogger(HubGitController.class);
	@Autowired HubGitRepository repository ;
	
	

}
