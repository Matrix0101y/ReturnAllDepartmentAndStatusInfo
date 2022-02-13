package com.example.nextpieceofproject.service.impl;

import com.example.nextpieceofproject.data.entity.Department;
import com.example.nextpieceofproject.data.repository.DepartmentRepository;
import com.example.nextpieceofproject.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> departments() {
        List<Department>departments=departmentRepository.findAll();
        System.out.println(departments.toString());
        return departments;
    }
}
