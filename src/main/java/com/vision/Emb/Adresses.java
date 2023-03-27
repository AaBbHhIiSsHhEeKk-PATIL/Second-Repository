package com.vision.Emb;

import javax.persistence.Embeddable;

@Embeddable
public class Adresses {
	
	private String street;
	private String state;
	private int pinCode;
	
	public Adresses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresses(String street, String state, int pinCode) {
		super();
		this.street = street;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
