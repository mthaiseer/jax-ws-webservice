package com.bottomup.ws.paymentprocessor.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentRequest {

	@XmlElement(name = "customerId", required = true)
	private Long customerId;
	private Card cardDetails;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Card getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(Card cardDetails) {
		this.cardDetails = cardDetails;
	}

}
