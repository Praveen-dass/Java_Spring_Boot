package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Door; 

public interface DoorRepo extends JpaRepository<Door,Integer>{
    List<Door> findByDoorId(int doorId);
    List<Door> findByAccessType(String accessType);
}


