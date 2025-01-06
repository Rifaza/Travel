package com.travel.Travel.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "registration_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_registration_type", nullable=false)
    private int id;

    @Column(name="registration_type", nullable=false)
    private String registration_type;
}
