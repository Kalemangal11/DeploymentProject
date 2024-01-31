package com.bikkadIt.IRCTCResourceApp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.IRCTCResourceApp.model.Passenger;
import com.bikkadIt.IRCTCResourceApp.model.Ticket;
import com.bikkadIt.IRCTCResourceApp.repository.PassengerRepo;
import com.bikkadIt.IRCTCResourceApp.repository.TicketRepo;

@Service
public class PassengerServiceImpl implements PassengerServiceI {

	@Autowired
	private PassengerRepo passengerRepo;

	@Autowired
	private TicketRepo ticketRepo;

	@Override
	public Ticket bookTicket(Passenger psg) {
		Passenger savedData = passengerRepo.save(psg);

			int pid = savedData.getPid();
			Ticket findticketData = ticketRepo.findById(pid).get();
			return findticketData;
	}

//	@Override
//	public List<Ticket> getTicketData() {
//		List<Ticket> findAll = ticketRepo.findAll();
//		return findAll;
//		
//	}

}
