package com.travel.Travel.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class TravelAgentRequestDTO
{
    private Integer agentId;
    private Integer registrationTypeId;
    private String agentName;
    private String agentAddress;
    private String agentContactNumber;
    private Double creditLimit;
    private Double commissionPercentage;
    private boolean status;
    private String icode;
    private String scode;
    private String email;
    private String code;
    private String mainCommisionCode;
    private String brNumber;
    //private List<PartnerDTO> partnerDTOList = new ArrayList<>()
}
