package com.travel.Travel.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.travel.Travel.dto.RegistrationTypeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Collate;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="travel_agent")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
public class TravelAgent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_travel_agent", nullable = false)
    private Integer id;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "registration_type_id", nullable = false)
    private RegistrationType registrationType;

    @Column(name="br_number")
    private String brNumber;

    @Column(name="agency_name")
    private String agentName;

    @Column(name="address", nullable = false)
    private String address;

    @Column(name="code")
    private String code;

    @Column(name="contact_number", nullable = false)
    private String contactNumber;

    @Column(name="credit_limit", nullable = false)
    private Boolean creditLimit;

    @Column(name="commission_percentage", nullable = false)
    private Double percentage;

    @Column(name="introducer_code")
    private String introducerCode;

}
