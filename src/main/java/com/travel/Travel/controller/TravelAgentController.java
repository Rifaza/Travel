package com.travel.Travel.controller;

import com.travel.Travel.dto.TravelAgentRequestDTO;
import com.travel.Travel.service.TravelAgentService;
import com.travel.Travel.service.impl.TravelAgentServiceImpl;
import com.travel.Travel.util.CommonResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.OptimisticLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/nonmotor/travel/agent")
@Tag(name="Travel Agent", description = "Travel Agent API")
public class TravelAgentController {
    @Autowired
    private final TravelAgentServiceImpl travelAgentService;

    @PostMapping(value = "/createOrUpdate")
    @Operation(summary = "Create or update travel agent",
            description = "This API allows to create or update travel agent")
    public ResponseEntity<CommonResponse> createOrUpdate(@RequestBody TravelAgentRequestDTO agentRequestDTO){
        return ResponseEntity.ok(travelAgentService.createOrUpdate(agentRequestDTO));
    }
}
