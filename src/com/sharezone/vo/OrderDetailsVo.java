package com.sharezone.vo;

public class OrderDetailsVo {
	
	private Integer OrderDetailsId;
	private Integer userId;
	private Integer workspaceId;
	private Integer active;
	
	private int SignUpId;
	private String Firstname;
	private String Lastname;
	private String Gender;
	private String Email;
	private String SUPassword;
	private String Usertype;
	
	private int WorkspaceDetailsId;
	private String workspacename;
	private String location;
	private String description;
	private String facilities;
	private int totalchairs;
	private Integer managerid;;
	private String username;
	private String WSPassword;
	public Integer getOrderDetailsId() {
		return OrderDetailsId;
	}
	public void setOrderDetailsId(Integer orderDetailsId) {
		OrderDetailsId = orderDetailsId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getWorkspaceId() {
		return workspaceId;
	}
	public void setWorkspaceId(Integer workspaceId) {
		this.workspaceId = workspaceId;
	}
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
	public int getSignUpId() {
		return SignUpId;
	}
	public void setSignUpId(int signUpId) {
		SignUpId = signUpId;
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
	
	public String getUsertype() {
		return Usertype;
	}
	public void setUsertype(String usertype) {
		Usertype = usertype;
	}
	public int getWorkspaceDetailsId() {
		return WorkspaceDetailsId;
	}
	public void setWorkspaceDetailsId(int workspaceDetailsId) {
		WorkspaceDetailsId = workspaceDetailsId;
	}
	public String getWorkspacename() {
		return workspacename;
	}
	public void setWorkspacename(String workspacename) {
		this.workspacename = workspacename;
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
	public int getTotalchairs() {
		return totalchairs;
	}
	public void setTotalchairs(int totalchairs) {
		this.totalchairs = totalchairs;
	}
	public Integer getManagerid() {
		return managerid;
	}
	public void setManagerid(Integer managerid) {
		this.managerid = managerid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSUPassword() {
		return SUPassword;
	}
	public void setSUPassword(String sUPassword) {
		SUPassword = sUPassword;
	}
	public String getWSPassword() {
		return WSPassword;
	}
	public void setWSPassword(String wSPassword) {
		WSPassword = wSPassword;
	}
	

}
