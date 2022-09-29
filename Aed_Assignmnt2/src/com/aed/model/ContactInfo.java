package com.aed.model;

/*
 * author Chakradhar Grandhi
 * NEUID: 002933727
 */
public class ContactInfo {
	private String contactNumber,email;
	
	public ContactInfo(String contactNumber,String email) {
		this.contactNumber= contactNumber;
		this.email=email;
		
		// TODO Auto-generated constructor stub	
	}
	public String getContactNumber() {
		return contactNumber;                     
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber=contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	

}
