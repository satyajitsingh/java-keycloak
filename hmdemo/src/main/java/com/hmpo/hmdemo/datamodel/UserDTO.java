package com.hmpo.hmdemo.datamodel;
import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonGetter;

public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String userName;

	private String emailAddress;

	private String firstName;

	private String lastName;

	private String password;
	
	private Map<String, String> UserDTO;
	
	public UserDTO()
	{

	}

	@JsonGetter("userName")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@JsonGetter("emailAddress")
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@JsonGetter("firstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@JsonGetter("lastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@JsonGetter("password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, String> getUserDTO() {
		return UserDTO;
	}

	public void setUserDTO(Map<String, String> userDTO) {
		UserDTO = userDTO;
	}


}
