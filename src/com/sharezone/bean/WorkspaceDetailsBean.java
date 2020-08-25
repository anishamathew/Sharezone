package com.sharezone.bean;

public class WorkspaceDetailsBean {
	
	private int id;
	private String workspacename;
	private String location;
	private String description;
	private String facilities;
	private int totalchairs;
	private Integer managerid;;
	private String username;
	private String password;
	private float currentrating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getManagerid() {
		return managerid;
	}
	public void setManagerid(Integer managerid) {
		this.managerid = managerid;
	}
	public float getCurrentrating() {
		return currentrating;
	}
	public void setCurrentrating(float currentrating) {
		this.currentrating = currentrating;
	}
	

}
