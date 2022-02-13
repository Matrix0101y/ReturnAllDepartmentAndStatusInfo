package com.example.nextpieceofproject.data.repository;

import com.example.nextpieceofproject.data.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends JpaRepository<Status,Long> {
}
