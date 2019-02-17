package com.learning.webservices.soapflightdata.soap;

import com.github.tonygregg.flight.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class FlightDetailsEndPoint {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//method
	// request GetAllFlightDetailsRequest
	// response GetAllFlightDetailsResponse
	
	
	
	/**
	 * end point is the 1st step
	 * 
	 * name space http://github.com/TonyGregg/flight GetFlightDetailsRequest
	 * @param flightReq
	 * @return
	 */
	 
	@PayloadRoot(namespace = "http://github.com/TonyGregg/flight", localPart="GetFlightDetailsRequest")
	@ResponsePayload
	public GetFlightDetailsResponse processFlightRequest(@RequestPayload GetFlightDetailsRequest flightReq) {
		logger.info("Processing flight Request for a given id "+flightReq.getId());
		if (flightReq.getId()>500) {
			throw new FlightNotFoundException("Flight ID is way too high. Please check");
		}
		GetFlightDetailsResponse response = new GetFlightDetailsResponse();

		FlightDetails flightDetails = new FlightDetails();

		flightDetails.setAirline("Delta");
		flightDetails.setFromCity("Chicago");
		flightDetails.setToCity("Austin, TX");
		flightDetails.setId(flightReq.getId());

		response.setFlightDetails(flightDetails);


		return response;

	}


	@PayloadRoot(namespace = "http://github.com/TonyGregg/flight", localPart="GetAllFlightDetailsRequest")
	@ResponsePayload
	public GetAllFlightDetailsResponse processAllReqs(@RequestPayload GetAllFlightDetailsRequest flightReq) {
		logger.info("Processing flight Request for all ");
		GetAllFlightDetailsResponse response = new GetAllFlightDetailsResponse();



		FlightDetails flightDetails = new FlightDetails();

		flightDetails.setAirline("Delta");
		flightDetails.setFromCity("Chicago");
		flightDetails.setToCity("Austin, TX");

		response.getFlightDetails().add(flightDetails);



		flightDetails = new FlightDetails();

		flightDetails.setAirline("American Airlines");
		flightDetails.setFromCity("Tampa");
		flightDetails.setToCity("New York, NY");


		response.getFlightDetails().add(flightDetails);



		return response;

	}
	
}
