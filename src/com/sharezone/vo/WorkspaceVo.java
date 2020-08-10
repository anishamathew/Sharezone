package com.sharezone.vo;

public class WorkspaceVo {
	
	private Integer id;
	private String workspaceName;
	private String location;
	private String description;
	private String facilities;
	private Integer totalChairs;
	private Integer managerId;
	private String userName;
	private String password;
	
	private Integer signupId;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String signUpPassword;
	private String userType;
	public int getId() {
		return id;
	}
	public String getWorkspaceName() {
		return workspaceName;
	}
	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public Integer getTotalChairs() {
		return totalChairs;
	}
	public void setTotalChairs(Integer totalChairs) {
		this.totalChairs = totalChairs;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getSignupId() {
		return signupId;
	}
	public void setSignupId(Integer signupId) {
		this.signupId = signupId;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSignUpPassword() {
		return signUpPassword;
	}
	public void setSignUpPassword(String signUpPassword) {
		this.signUpPassword = signUpPassword;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}