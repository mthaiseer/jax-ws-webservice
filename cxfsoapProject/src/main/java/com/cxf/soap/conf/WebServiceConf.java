package com.cxf.soap.conf;


import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cxf.soap.ws.HelloWordServices;

@Configuration
public class WebServiceConf {

	@Autowired
	Bus bus;
	
	@Bean
	public Endpoint endPoint() {
		EndpointImpl endPoint = new EndpointImpl(bus, new HelloWordServices());
		endPoint.publish("/hello");
		return endPoint;
		
	}
}
