package com.bikkadIt.IRCTCResourceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.IRCTCResourceApp.model.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

}
