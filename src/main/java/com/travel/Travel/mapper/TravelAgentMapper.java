package com.travel.Travel.mapper;

import com.travel.Travel.dto.TravelAgentRequestDTO;
import com.travel.Travel.dto.TravelAgentResponseDTO;
import com.travel.Travel.modal.TravelAgent;
import org.springframework.stereotype.Component;

@Component
public class TravelAgentMapper {


    public TravelAgent toEntity(TravelAgentRequestDTO dto, TravelAgent agent) {

        agent.setId(dto.getAgentId());
        agent.setAgentName(dto.getAgentName());
        agent.setBrNumber(dto.getBrNumber());
        return agent;
    }
    public TravelAgentResponseDTO toDto(TravelAgent agent) {
        TravelAgentResponseDTO dto = new TravelAgentResponseDTO();
        dto.setAgentId(agent.getId());
        dto.setAddress(agent.getAddress());

        return dto;

    }
}
