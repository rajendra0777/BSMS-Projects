package in.ashokit.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PrimaryKeys {
	
	private Integer cid;
	private String passportId;
	
	
	
	public PrimaryKeys() {
		
	}
	
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getPassportId() {
		return passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	@Override
	public String toString() {
		return "PrimaryKeys [cid=" + cid + ", passportId=" + passportId + "]";
	}
	


}
