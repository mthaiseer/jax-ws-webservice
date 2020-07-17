package com.bottomup.ws.paymentprocessor.shared;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentResponse")
public class PaymentResponse {

	private long cardNumber;
	private boolean processed;

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public boolean isProcessed() {
		return processed;
	}

	public void setProcessed(boolean processed) {
		this.processed = processed;
	}

}
