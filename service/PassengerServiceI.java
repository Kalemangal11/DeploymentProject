package com.bikkadIt.IRCTCResourceApp.service;



import com.bikkadIt.IRCTCResourceApp.model.Passenger;
import com.bikkadIt.IRCTCResourceApp.model.Ticket;

public interface PassengerServiceI {

	public Ticket bookTicket(Passenger psg);
	//public List<Ticket> getTicketData ();
}
