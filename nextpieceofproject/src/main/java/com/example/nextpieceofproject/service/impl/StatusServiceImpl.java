package com.example.nextpieceofproject.service.impl;

import com.example.nextpieceofproject.data.entity.Status;
import com.example.nextpieceofproject.data.repository.StatusRepository;
import com.example.nextpieceofproject.service.StatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StatusServiceImpl implements StatusService {

    private final StatusRepository statusRepository;

    @Override
    public List<Status> statuses() {
        List<Status>statuses= statusRepository.findAll();
        System.out.println(statuses.toString());
        return statuses;
    }
}
