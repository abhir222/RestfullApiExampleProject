package com.rest.org.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketRequestDto {
	int bookingId;
	String passangerName;
	String fromStation;
	String toStation;
	String bookingStatus;

}
