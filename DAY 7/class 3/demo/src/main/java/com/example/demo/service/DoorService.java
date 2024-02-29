package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Door;
import com.example.demo.repository.DoorRepo;

@Service
public class DoorService {
    private DoorRepo doorRepo;
    public DoorService(DoorRepo doorRepo)
    {
        this.doorRepo=doorRepo;
    }

    public boolean saveMethod(Door door)
    {
        try{
            doorRepo.save(door);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    public List<Door> getDoorDetails()
    {
        return doorRepo.findAll();
    }

    public List<Door> filterByDoorId(int doorId)
    {
        return doorRepo.findByDoorId(doorId);
    }

    public List<Door> filterByAccessType(String accessType)
    {
        return doorRepo.findByAccessType(accessType);
    }
}


