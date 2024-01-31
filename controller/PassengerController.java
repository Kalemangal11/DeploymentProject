package com.bikkadIt.IRCTCResourceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.IRCTCResourceApp.model.Passenger;
import com.bikkadIt.IRCTCResourceApp.model.Ticket;
import com.bikkadIt.IRCTCResourceApp.service.PassengerServiceI;

@RestController
public class PassengerController {

	@Autowired
	private PassengerServiceI PassengerServiceI;

	@PostMapping(value = "/getTicket", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger psg) {
		System.out.println("\r\n" + "java.lang.IllegalStateException: No suitable default ClientHttpConnector found");
		Ticket ticketDetails = PassengerServiceI.bookTicket(psg);
		return new ResponseEntity<Ticket>(ticketDetails, HttpStatus.CREATED);
	}
	

//	@GetMapping(value ="/getTicket", produces = "application/json")
//	public ResponseEntity<List<Ticket>> getFlightData() {
//	 List<Ticket> ticketData = PassengerServiceI.getTicketData();
//		return new ResponseEntity<List<Ticket>>(ticketData, HttpStatus.OK);
//	}
}
