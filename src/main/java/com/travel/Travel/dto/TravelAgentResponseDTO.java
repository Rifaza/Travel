package com.travel.Travel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelAgentResponseDTO {
    private Integer agentId;
    private Integer registrationTypeId;
    private RegistrationTypeDTO registrationTypeDTO;
    private Double commissionPercentage;
    private String introducerCode;
    private String address;
    private String contactNumber;
    private Double creditLimit;
    private Boolean status;
    private String email;
    private String code;
}
