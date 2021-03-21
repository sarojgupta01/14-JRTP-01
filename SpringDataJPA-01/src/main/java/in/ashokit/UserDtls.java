package in.ashokit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_dtls")
public class UserDtls {
	
	@Id
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="USER_EMAIL")
	private String userEmail;
	
	@Column(name="USER_AGE")
	private Integer userAge;
	
	@Column(name="USER_COUNTRY")
	private String userCountry;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	@Override
	public String toString() {
		return "UserDtls [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userAge="
				+ userAge + ", userCountry=" + userCountry + "]";
	}
	
	
	

}
