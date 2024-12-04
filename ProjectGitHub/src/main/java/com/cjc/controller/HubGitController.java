package com.cjc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.serviceI.HubGitServiceI;

@RestController
public class HubGitController 
{
    private static final Logger LOG=LoggerFactory.getLogger(HubGitController.class);
	@Autowired HubGitServiceI serviceI;
	
	
}
