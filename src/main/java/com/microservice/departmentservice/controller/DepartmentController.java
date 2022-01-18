package com.microservice.departmentservice.controller;

import com.microservice.departmentservice.entity.Department;
import com.microservice.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("save")
    public Department save(@RequestBody Department department){
        log.info("Inside Save Department method of DepartmentController");
        return departmentService.save(department);
    }

    @GetMapping("{id}")
    public Optional<Department> findDepartmentById(@PathVariable Long id){
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findById(id);
    }
}
