package com.cxf.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloWordServices {
	
	@WebMethod
	public String sayHello() {
		return "Hello Mohamed Thaiseer";
	}

}
