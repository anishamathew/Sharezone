package com.sharezone.bean;

public class SignUpBean {
	private int id;
	private String Firstname;
	private String Lastname;
	private String Gender;
	private String Email;
	private String Password;
	private String Usertype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUsertype() {
		return Usertype;
	}
	public void setUsertype(String usertype) {
		Usertype = usertype;
	}
	

}
