package edu.ycp.cs320.awesomepage.shared;

public class User {
	private String userName;
	private String password;
	
	public User(String name, String password) {
		
		this.userName = name;
		this.password = password;
		
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getpassword() {
		return password;
	}
	
}
