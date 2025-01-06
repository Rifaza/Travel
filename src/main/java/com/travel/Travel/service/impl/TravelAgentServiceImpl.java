package com.travel.Travel.service.impl;

import com.travel.Travel.dto.TravelAgentRequestDTO;
import com.travel.Travel.dto.TravelAgentResponseDTO;
import com.travel.Travel.exception.RecordNotFoundException;
import com.travel.Travel.mapper.TravelAgentMapper;
import com.travel.Travel.modal.TravelAgent;
import com.travel.Travel.repository.TravelAgentRepository;
import com.travel.Travel.service.TravelAgentService;
import com.travel.Travel.util.CommonResponse;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TravelAgentServiceImpl implements TravelAgentService {

    @Autowired
    private  TravelAgentRepository travelAgentRepository;

    @Autowired
    private TravelAgentMapper travelAgentMapper;

    @Override
    public CommonResponse createOrUpdate(TravelAgentRequestDTO requestDTO) {

        TravelAgent travelAgent = new TravelAgent();
        CommonResponse commonResponse = new CommonResponse();

        if(requestDTO.getAgentId() != null) {
            travelAgent = travelAgentRepository.findById(requestDTO.getAgentId())
                    .orElseThrow(()-> new RecordNotFoundException("Agent not found"));
        }

        travelAgent = travelAgentMapper.toEntity(requestDTO, travelAgent);

        TravelAgent savedTravelAgent  = travelAgentRepository.save(travelAgent);
        TravelAgentResponseDTO responseDTO  = travelAgentMapper.toDto(savedTravelAgent);
        commonResponse.setData(responseDTO);
        commonResponse.setMessage("Agent created successfully");
        commonResponse.setStatus(HttpStatus.CREATED);
        commonResponse.setTimestamp(LocalDateTime.now());

        return commonResponse;
    }
}
