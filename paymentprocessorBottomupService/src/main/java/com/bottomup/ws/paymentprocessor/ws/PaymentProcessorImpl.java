package com.bottomup.ws.paymentprocessor.ws;

import com.bottomup.ws.paymentprocessor.exceptions.PaymentProcessorException;
import com.bottomup.ws.paymentprocessor.shared.PaymentRequest;
import com.bottomup.ws.paymentprocessor.shared.PaymentResponse;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public PaymentResponse process(PaymentRequest request) throws PaymentProcessorException {
		
		if(request.getCardDetails().getCardHolderName() == null || request.getCardDetails().getCardHolderName().length() == 0 ) {
			throw new PaymentProcessorException("Invalid cardholder name");
		}
		
		long cardNumber = request.getCardDetails().getCardNumber();
		PaymentResponse response = new PaymentResponse();
		response.setCardNumber(cardNumber);
		response.setProcessed(true);
		return response;
	}

}
