package com.naresh.modal;

import javax.validation.constraints.Size;

import com.naresh.validation.ContactNumberConstraint;
import com.naresh.validation.ValidEmail;

public class RequestInfo {
	 
	@ValidEmail(min = 10, message = "Please enter a valid email.")
	private String email;
 
	@Size(min = 5, max = 255, message = "Please enter between {min} and {max} characters.")
	private String text;
	
	@ContactNumberConstraint
	private String phoneNumber;
 
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
 
	public String getText() {
		return text;
	}
 
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "RequestInfo [email=" + email + ", text=" + text + ", phoneNumber=" + phoneNumber + "]";
	}
 
	
}