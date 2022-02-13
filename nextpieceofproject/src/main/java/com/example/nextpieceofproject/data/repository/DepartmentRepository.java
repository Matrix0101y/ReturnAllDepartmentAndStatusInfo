package com.example.nextpieceofproject.data.repository;

import com.example.nextpieceofproject.data.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
