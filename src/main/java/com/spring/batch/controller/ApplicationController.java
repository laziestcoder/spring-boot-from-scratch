package com.spring.batch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৫/৪/২০
 Time: ১:৫৯ PM
 ***/

@RestController
public class ApplicationController {
    private JobLauncher jobLauncher;
    private Job processJob;

    public ApplicationController(JobLauncher jobLauncher, Job processJob) {
        this.jobLauncher = jobLauncher;
        this.processJob = processJob;
    }

    @RequestMapping("/invokejob")
    public String handle() throws Exception {

        JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
                .toJobParameters();
        jobLauncher.run(processJob, jobParameters);

        return "Batch job has been invoked";
    }

    @RequestMapping("/")
    public String index() throws Exception {
        return "Welcome to Spring Batch job";
    }


}
