package com.bottomup.ws.paymentprocessor.shared;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Card")
public class Card {

	private String cardType;
	private long cardNumber;
	private String cardHolderName;

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

}
