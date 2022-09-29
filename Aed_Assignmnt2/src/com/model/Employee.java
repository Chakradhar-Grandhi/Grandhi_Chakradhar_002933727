package com.model;
import java.awt.Image;
import java.time.LocalDate;


public class Employee {
	 
	 private String name,gender,level,teamInfo,positionTitle;
	 private int employeeID, age;
	 private ContactInfo contactInfo;
	 private Image image;
	 private LocalDate startDate;
	 
	 public Employee(int employeeID,String name,int age,String gender,LocalDate startDate,
			 String level,String teamInfo,String positionTitle,ContactInfo contactInfo/*Image image*/){
		 super();
		 this.name = name;
		 this.employeeID = employeeID;
		 this.age = age;
		 this.gender = gender;
		 this.startDate = startDate;
		 this.level = level;
		 this.teamInfo = teamInfo;
		 this.positionTitle = positionTitle;
		 this.contactInfo = contactInfo;
		 /*this.image = image;
		  */
		 
	 }
	 
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
		 
	 }
	 public int getEmployeeID() {
		 return employeeID;
	 }
	 
	 public void setEmployeeID(int employeeID) {
		 this.employeeID = employeeID;
		 
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
		 
		 
	 }
	 
	 public String getGender() {
		 return gender;
	 }
	 
	 public void setGender(String gender) {
		 this.gender = gender;
		 
	 }
	 
	 public LocalDate getStartDate() {
		 return startDate;
	 }
	 
	 public void setStartDate(LocalDate startDate) {
		 this.startDate = startDate;
		 
		 
	 }
	 
	 public String getLevel() {
		 return level;
	 }
	 
	 public void setLevel( String level) {
		 this.level = level;
	 }
	 
	 public String getTeamInfo() {
		 return teamInfo;
	 }
	 
	 public void setTeamInfo(String teamInfo) {
		 this.teamInfo = teamInfo;
		 
	 }
	 
	 public String getPositionTitle() {
		 return positionTitle;
	 }
	 
	 public void setPositionTitle(String positionTitle) {
		 this.positionTitle = positionTitle;
		 
	 }
	 
	 public ContactInfo getContactInfo() {
		 return contactInfo;
	 }
	 
	 public void setContactInfo(ContactInfo contactInfo) {
		 this.contactInfo = contactInfo;
		 
	 }
	 
	 public Image getImage() {
		 return image;
	 }
	 
	 public void setImage(Image image) {
		 this.image = image;
		 
	 }
	 
	 @Override
		public String toString() {
			return "Employee [Name=" + name + ", EmployeeID=" + employeeID + ", Age=" + age + ", Gender=" + gender
					+ ", Start_date=" + startDate + ", Level=" + level + ", Team_info=" + teamInfo + ", Position_title="
					+ positionTitle + ", contact_Info=" + contactInfo + ", image=" + image + "]";
		}
	 

}
