package com.sambit.model;

import javax.persistence.*;

/**
 * @Project : OnlineEducation
 * @Auther : Sambit Kumar Pradhan
 * @Created On : 02/10/2022 - 3:48 PM
 */
@Entity
@Table(name = "register")
public class Register {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int registerId;
	private String name;
	private String email;
	private String password;
	private String userType;
	private String profileImageUploadPath;

	public int getRegisterId() {
		return registerId;
	}

	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfileImageUploadPath() {
		return profileImageUploadPath;
	}

	public void setProfileImageUploadPath(String profileImageUploadPath) {
		this.profileImageUploadPath = profileImageUploadPath;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Register{" +
			   "registerId=" + registerId +
			   ", name='" + name + '\'' +
			   ", email='" + email + '\'' +
			   ", password='" + password + '\'' +
			   ", userType='" + userType + '\'' +
			   ", profileImageUploadPath='" + profileImageUploadPath + '\'' +
			   '}';
	}
}
