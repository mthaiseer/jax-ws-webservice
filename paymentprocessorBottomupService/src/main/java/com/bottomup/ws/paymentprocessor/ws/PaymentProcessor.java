package com.bottomup.ws.paymentprocessor.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.bottomup.ws.paymentprocessor.exceptions.PaymentProcessorException;
import com.bottomup.ws.paymentprocessor.shared.PaymentRequest;
import com.bottomup.ws.paymentprocessor.shared.PaymentResponse;

@WebService(name = "PaymentProcessor")
public interface PaymentProcessor {
	
	@WebMethod
	public @WebResult(name = "response")PaymentResponse process(@WebParam(name =  "paymentRequest") PaymentRequest request) throws PaymentProcessorException;

}
