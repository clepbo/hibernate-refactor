package com.mavenprojet.israel.project001;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "datavalue", schema="people_data")
public class Data_value {
	@Column(name= "firstName")
    private String firstName;
	
	@Column(name= "lastName")
    private String lastName;
	
	@Column(name= "companyName")
    private String companyName;
	
	@Column(name= "address")
    private String address;
	
	@Column(name= "city")
    private String city;
	
	@Column(name= "email")
    private String email;
	
	@Column(name= "phoneNo1")
    private String phoneNo1;
	
	@Column(name= "phoneNo2")
    private String phoneNo2;
	
	@Id
	@Column(name = "serialNo", updatable = false, nullable = false)
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private int serialNo;
    
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo1() {
		return phoneNo1;
	}
	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}
	public String getPhoneNo2() {
		return phoneNo2;
	}
	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}
	
	@Override
	public String toString() {
		return "Data_value [firstName=" + firstName + ", lastName=" + lastName + ", companyName=" + companyName
				+ ", address=" + address + ", city=" + city + ", email=" + email + ", phoneNo1=" + phoneNo1
				+ ", phoneNo2=" + phoneNo2 + ", serialNo=" + serialNo + "]";
	}

}
