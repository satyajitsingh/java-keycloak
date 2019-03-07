package com.hmpo.hmdemo.datamodel;

import com.fasterxml.jackson.annotation.JsonGetter;

public class UserCredentials {
	
	private String password;
	private String username;
	
	@JsonGetter("userName")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@JsonGetter("password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
