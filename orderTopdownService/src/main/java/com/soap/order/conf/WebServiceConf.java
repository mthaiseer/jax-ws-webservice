package com.soap.order.conf;


import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.soap.order.ws.OrderService;

@Configuration
public class WebServiceConf {

	@Autowired
	Bus bus;
	
	@Bean
	public Endpoint endPoint() {
		EndpointImpl endPoint = new EndpointImpl(bus, new OrderService());
		endPoint.publish("/orders");
		return endPoint;
		
	}
}
