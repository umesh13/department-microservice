package com.microservice.departmentservice.service;

import com.microservice.departmentservice.entity.Department;
import com.microservice.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department department) {
        log.info("Inside save department method of DepartmentService");
        return departmentRepository.save(department);
    }

    public Optional<Department> findById(Long id) {
        log.info("Inside find department method of DepartmentService ");
        return departmentRepository.findById(id);
    }
}
