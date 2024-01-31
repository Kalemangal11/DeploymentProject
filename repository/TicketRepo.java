package com.bikkadIt.IRCTCResourceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.IRCTCResourceApp.model.Ticket;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer>{

}
