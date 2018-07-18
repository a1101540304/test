package dto;

public class User {
	private String UserID;
	private String UserName;
	private Integer superuser;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public Integer getSuperuser() {
		return superuser;
	}
	public void setSuperuser(Integer superuser) {
		this.superuser = superuser;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
}
