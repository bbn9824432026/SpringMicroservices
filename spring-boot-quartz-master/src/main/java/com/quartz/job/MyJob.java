package com.quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
public class MyJob extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

}
