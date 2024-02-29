package com.example.demo.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Door;
import com.example.demo.service.DoorService;

@RestController
public class DoorController {
    private DoorService doorService;
    public DoorController(DoorService doorService)
    {
        this.doorService=doorService;
    }

    @PostMapping("/api/door")
    public ResponseEntity<Door> postMethod(@RequestBody Door door) {
        if(doorService.saveMethod(door) == true)
            return new ResponseEntity<>(door,HttpStatus.CREATED);
        return new ResponseEntity<>(door,HttpStatus.INTERNAL_SERVER_ERROR);

    }
    
    @GetMapping("/api/door")
    public ResponseEntity<List<Door>> getMethod() {
        List<Door> list=doorService.getDoorDetails();
        if(list.size() == 0)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<List<Door>> filterByDoorId(@PathVariable("doorId") int doorId) {
        List<Door> list=doorService.filterByDoorId(doorId);
        if(list.size() == 0)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/api/door/accesstype/{accessType}")
    public ResponseEntity<List<Door>> filterByAccessType(@PathVariable("accessType") String accessType) {
        List<Door> list=doorService.filterByAccessType(accessType);
        if(list.size() == 0)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}


