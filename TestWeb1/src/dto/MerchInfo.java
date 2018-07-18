package dto;

public class MerchInfo {
	private String MerchID;
	private String MerchName;
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
	public Integer getMerchPrice() {
		return MerchPrice;
	}
	public void setMerchPrice(Integer merchPrice) {
		MerchPrice = merchPrice;
	}
}