package com.learning.webservices.soapflightdata.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

// spring configuration
/**
 * 
 * WebServiceConfig is the 2nd step. 
 * Here you will have to register MessageDispatcherServlet (just like front controller in MVC) for
 * associating any request for a given URL 
 * 
 * 3rd step is to create the wsdl
 * the wsdl url we want is something like /flight/flights.wsdl based on flight-detail.xsd
 *
 * End URL:
 *
 * http://locahost:8090/flight/flights.wsdl (flights is in the bean name of setDefaultWsdlDefn)
 * 
 * 
 * it is spring configuration
 * Enable spring web services
 * @author genil
 *
 */
@EnableWs
@Configuration
public class WebServiceConfig {
/**
 * message dispatcher servlet
 * ApplicationContext
 * url -> ws/*
 */
	
	@Bean public ServletRegistrationBean mapUrl(ApplicationContext context) {
		MessageDispatcherServlet messageDispatherServlet = new MessageDispatcherServlet();
		messageDispatherServlet.setApplicationContext(context);
		messageDispatherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(messageDispatherServlet,"/flight/*");
		
	}
	
	/**
	 * 3rd step - create the xsd schema based on the xsd defined
	 * @return
	 */
	
	@Bean public XsdSchema flightSchema() {
		return new SimpleXsdSchema(new ClassPathResource("flight-detail.xsd"));
	}
	
	
	/**
	 * this is the 4th step...
	 * portType -  FlightPort
	 * Namespace : http://github.com/TonyGregg/flight
	 * 
	 * 
	 * @param flightSchema
	 * @return
	 */
	@Bean(name="flights")
	public DefaultWsdl11Definition setDefaultWsdlDefn(XsdSchema flightSchema) {
		
		DefaultWsdl11Definition defn = new DefaultWsdl11Definition();
		
		defn.setPortTypeName("FlightPort");
		defn.setTargetNamespace("http://github.com/TonyGregg/flight");
		defn.setLocationUri("/flight");
		
		defn.setSchema(flightSchema);
		
		
		return defn;
		
	}
}
