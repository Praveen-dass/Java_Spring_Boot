package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Job;
import com.example.demo.service.JobService;



@RestController
public class JobController {
    private JobService jobService;

    @Autowired
    public JobController(JobService jobService)
    {
        this.jobService=jobService;
    }

    @PostMapping("/api/job")    
    public ResponseEntity<Job> getname(@RequestBody Job job)
    {
        if(jobService.safe(job)==false)
        {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/api/jobs")
    public List<Job> getMethodName() {
        return jobService.listofjobs();
    }

    @GetMapping("/api/jobs/{jobid}")
    public Job getMethodNamee(@PathVariable int jobid) {
        return jobService.job_id(jobid);
    }


}
