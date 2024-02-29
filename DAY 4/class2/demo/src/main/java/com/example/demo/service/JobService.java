package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Job;
import com.example.demo.repository.JobRepo;

@Service
public class JobService {
    private JobRepo jobRepo;

    @Autowired

    public JobService(JobRepo jobRepo)
    {
        this.jobRepo=jobRepo;
    }

    public boolean safe(Job job)
    {
        try{
            jobRepo.save(job);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    public List<Job>listofjobs()
    {
        return jobRepo.findAll();
    }

    public Job job_id(int jobid)
    {
        Optional <Job> opjob = jobRepo.findById(jobid);
        return opjob.orElse(null);
    }
}
