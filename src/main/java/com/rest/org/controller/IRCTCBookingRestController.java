package com.rest.org.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.org.dto.TicketRequestDto;

@RestController
public class IRCTCBookingRestController {

	@PostMapping("/booking")
	public ResponseEntity<TicketRequestDto> bookTicket(@RequestBody TicketRequestDto ticketDto) {
		System.out.println(ticketDto);
		ticketDto.setBookingStatus("not-Confirmed");

		System.out.println("This is from IRCTC Application" + ticketDto);

		return ResponseEntity.ok(ticketDto);
	}
}
