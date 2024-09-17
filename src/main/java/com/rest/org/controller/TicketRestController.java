package com.rest.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rest.org.dto.TicketRequestDto;

@RestController
public class TicketRestController {

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping(value = "/bookTicket", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<TicketRequestDto> bookTicket(@RequestBody TicketRequestDto ticketDto) {

		String url = "http://localhost:8081/booking";

		TicketRequestDto recieveddata = restTemplate.postForObject(url, ticketDto, TicketRequestDto.class);
		System.out.println("Received Data From IRCTC:" + recieveddata);
		return ResponseEntity.ok(recieveddata);

	}
}
