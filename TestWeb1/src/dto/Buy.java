package dto;

public class Buy {
	private String MerchID;
	private String MerchName;
	private String UserID;
	private String UserName;
	private Integer MerchPrice;
	public String getMerchID() {
		return MerchID;
	}
	public void setMerchID(String merchID) {
		MerchID = merchID;
	}
	public String getMerchName() {
		return MerchName;
	}
	public void setMerchName(String merchName) {
		MerchName = merchName;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public Integer getMerchPrice() {
		return MerchPrice;
	}
	public void setMerchPrice(Integer merchPrice) {
		MerchPrice = merchPrice;
	}
	

}
