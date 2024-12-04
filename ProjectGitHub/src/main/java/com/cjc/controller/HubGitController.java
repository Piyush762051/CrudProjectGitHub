package com.cjc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.model.HubGit;
import com.cjc.serviceI.HubGitServiceI;

@RestController
public class HubGitController 
{
    private static final Logger LOG=LoggerFactory.getLogger(HubGitController.class);
	
    @Autowired HubGitServiceI serviceI;
	
    @PostMapping("/postData")
	public ResponseEntity<HubGit> onsaveData(@RequestBody HubGit h)
	{
		LOG.info("Save Data");
		  serviceI.saveData(h);
		return new ResponseEntity<HubGit>(h,HttpStatus.CREATED);	
	}
}
