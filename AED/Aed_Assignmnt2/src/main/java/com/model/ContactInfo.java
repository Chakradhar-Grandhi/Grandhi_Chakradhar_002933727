/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

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
	@Override
	public String toString() {
		return "ContactInfo [CellPhone=" + contactNumber + ", email=" + email + "]";
	}
	

}
