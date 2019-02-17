package com.learning.webservices.soapflightdata.soap;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

/**
 * Created by genil on 2/16/19 at 18 35
 **/

@SoapFault(faultCode = FaultCode.CUSTOM, customFaultCode = "{http://github.com/TonyGregg/flight}001_FLIGHT_NOT_FOUND")
public class FlightNotFoundException extends RuntimeException {
    FlightNotFoundException(String message) {
        super(message);
    }
}
