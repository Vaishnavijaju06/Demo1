package com.debitcard;

public class WrongPinException extends RuntimeException {
 String message;
	public WrongPinException(String message) {
		super(message);
	//this.message = "You have entered wrong pin";
	
	}
	

}
