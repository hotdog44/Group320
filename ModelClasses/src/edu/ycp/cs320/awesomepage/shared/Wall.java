package edu.ycp.cs320.awesomepage.shared;

public class Wall {
	private int id; //keep track of what user do
	private int userId;
	private String status;
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getUserId() {
		return userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void editWall(){
		
	}
	
	public void deleteWall(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
