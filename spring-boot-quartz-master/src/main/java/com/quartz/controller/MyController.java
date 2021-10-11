package com.quartz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quartz.component.JobScheduleCreator;
import com.quartz.entity.SchedulerJobInfo;
import com.quartz.service.SchedulerJobService;

@RestController
public class MyController {

	
	@Autowired
	private JobScheduleCreator jobCreate; 
	
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private SchedulerJobService service;
	
	@Autowired
	private SchedulerJobInfo info;
	
	@GetMapping("/")
	public String test() {
		info.setJobClass("MyJob");
		info.setJobName("job1");
		info.setJobGroup("group1");
		info.setRepeatTime(5L);
		
		service.startJobNow(info);
		return "test";
	}
}
