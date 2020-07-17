package com.bottomup.ws.paymentprocessor.conf;


import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bottomup.ws.paymentprocessor.ws.PaymentProcessorImpl;


@Configuration
public class WebServiceConf {

	@Autowired
	Bus bus;
	
	@Bean
	public Endpoint endPoint() {
		EndpointImpl endPoint = new EndpointImpl(bus, new PaymentProcessorImpl());
		endPoint.publish("/paymentProcessor");
		return endPoint;
		
	}
}
