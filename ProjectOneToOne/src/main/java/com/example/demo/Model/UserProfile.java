package com.example.demo.Model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name="UserProfile")
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
	@Column(name="phoneNumber")
   private String phoneNumber;
	@Column(name="address")
   private String address;
	@Enumerated(EnumType.STRING)
	@Column(name="gender")
   private Gender gender;
	@Column(name="birth_of_date")
   private LocalDate birthOfDate;
	@JsonBackReference
	@OneToOne
	@JoinColumn(name="up_id")
	private User user;
	
public UserProfile() {
	super();
	// TODO Auto-generated constructor stub
}

public UserProfile(long id, String phoneNumber, String address, Gender gender, LocalDate birthOfDate, User user) {
	super();
	this.id = id;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.gender = gender;
	this.birthOfDate = birthOfDate;
	this.user = user;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public LocalDate getBirthOfDate() {
	return birthOfDate;
}

public void setBirthOfDate(LocalDate birthOfDate) {
	this.birthOfDate = birthOfDate;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
public String toString() {
	return "UserProfile [id=" + id + ", phoneNumber=" + phoneNumber + ", address=" + address + ", gender=" + gender
			+ ", birthOfDate=" + birthOfDate + ", user=" + user + "]";
}


   
}
