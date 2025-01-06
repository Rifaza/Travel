package com.travel.Travel.repository;

import com.travel.Travel.modal.TravelAgent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelAgentRepository  extends JpaRepository<TravelAgent, Integer> {
}
