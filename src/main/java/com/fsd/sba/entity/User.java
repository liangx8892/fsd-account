package com.fsd.sba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "`USER`")
public class User {
	
	public User() {
		
	}
	
	public User(String password,
				String email, String firstName, String lastName) {
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

    @Id
    @GeneratedValue
	@Column(name = "ID")
    private Long id;

	@Column(name = "EMAIL")
	private String email;

    @Column(name = "PASSWORD")
    private String password;
    
    @Column(name = "FIRST_NAME")
    private String firstName;
    
    @Column(name = "LAST_NAME")
    private String lastName;
    
    @Column(name = "MOBILE")
    private String mobile;
    
    @Column(name = "ROLE")
    private String role;
    
    @Column(name = "ACTIVE")
    private Boolean active;

	@Column(name = "AVATAR_PATH")
	private String avatarPath;

	@Column(name = "BALANCE")
	private String balance;


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAvatarPath() {
		return avatarPath;
	}

	public void setAvatarPath(String avatarPath) {
		this.avatarPath = avatarPath;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", email='" + email + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", mobile='" + mobile + '\'' +
				", role='" + role + '\'' +
				", active=" + active +
				", avatarPath='" + avatarPath + '\'' +
				", balance='" + balance + '\'' +
				'}';
	}
}