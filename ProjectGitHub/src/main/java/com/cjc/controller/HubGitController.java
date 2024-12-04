package com.cjc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.HubGit;
import com.cjc.serviceI.HubGitServiceI;

@RestController
public class HubGitController 
{
    private static final Logger LOG=LoggerFactory.getLogger(HubGitController.class);
	@Autowired HubGitServiceI serviceI;
	
	@GetMapping("/HuBGitDataSave")
	public ResponseEntity<List<HubGit>> ongetData()
	{
		
		LOG.info(" this is getMethod");
		LOG.info("this is Dataget");
		List<HubGit> list=serviceI.saveData();
		return new ResponseEntity<List<HubGit>>(list,HttpStatus.CREATED);
	}
}
