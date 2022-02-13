package com.example.nextpieceofproject.controller;

import com.example.nextpieceofproject.data.entity.Status;
import com.example.nextpieceofproject.service.StatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/info")
public class StatusController {

    private final StatusService statusService;

    @GetMapping("/statuses")
    public List<Status> returnStatusInfo() {
        return statusService.statuses();
    }
}
