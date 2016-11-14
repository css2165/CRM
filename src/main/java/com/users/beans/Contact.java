package com.users.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long userId;
	
	@Column(unique = true)
	private String email;
	
	private String firstName;
	private String lastName;
	private boolean active;
	private String phoneNumber;
	private String twitterHandle;
	private String facebookUrl;
	//default constructor
	protected Contact(){
			
		}
	
	//constructor 2
	public Contact(long userId) {
		this.userId = userId;
		this.active = true;
	}
	
	//big constructor
	public Contact(long userId, String email, String firstName, String lastName, boolean active, String phoneNumber) {
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = active;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
		
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", userId=" + userId + ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", active=" + active + ", phoneNumber=" + phoneNumber
				+ ", twitterHandle=" + twitterHandle + ", facebookUrl=" + facebookUrl + "]";
	}
	
	
		public String getTwitterHandle() {
			return twitterHandle;
		}
		public void setTwitterHandle(String twitterHandle) {
			this.twitterHandle = twitterHandle;
		}
		public String getFacebookUrl() {
			return facebookUrl;
		}
		public void setFacebookUrl(String facebookUrl) {
			this.facebookUrl = facebookUrl;
		}
	
	
		

	}
	
	
