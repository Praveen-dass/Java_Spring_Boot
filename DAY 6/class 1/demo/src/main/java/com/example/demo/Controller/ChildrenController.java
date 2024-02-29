package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ChildrenService;
import com.example.demo.model.Children;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ChildrenController {
    private ChildrenService childrenService;

    public ChildrenController(ChildrenService childrenService)
    {
        this.childrenService=childrenService;
    }

    @PostMapping("/api/children")
    public ResponseEntity postMethodName(@RequestBody Children children) {
        return childrenService.saveChildrenDetail(children);
    }
    
    @GetMapping("/api/children/sortBy/{field}")
    public List<Children> getMethodName(@PathVariable("field") String field) {
        return childrenService.getSortedList(field);
    }

    @GetMapping("/api/children/{offset}/{pagesize}")
    public List<Children> getMethodName1(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize) {
        return childrenService.getPageList(offset,pagesize);
    }

    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    public List<Children> getMethodName2(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize,@PathVariable("field") String field) {
        return childrenService.getPageSortList(offset,pagesize,field);
    }
    
    
    
    
}
