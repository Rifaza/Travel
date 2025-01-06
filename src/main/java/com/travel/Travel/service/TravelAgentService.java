package com.travel.Travel.service;

import com.travel.Travel.dto.TravelAgentRequestDTO;
import com.travel.Travel.util.CommonResponse;

public interface TravelAgentService {
    CommonResponse createOrUpdate(TravelAgentRequestDTO travelAgentRequestDTO);
}
