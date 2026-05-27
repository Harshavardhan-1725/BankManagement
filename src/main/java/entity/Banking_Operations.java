package entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Banking_Operations {

	private String username;
	
	private String password;
	@Id
	private long acc_num;
	
	private String acc_name;
	
	private double acc_bal;
	
	private String branch_name;
	
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
	
	public long getAcc_num() {
		return acc_num;
	}
	
	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;
	}
	
	public String getAcc_name() {
		return acc_name;
	}
	
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	
	public double getAcc_bal() {
		return acc_bal;
	}
	
	public void setAcc_bal(double acc_bal) {
		this.acc_bal = acc_bal;
	}
	
	public String getBranch_name() {
		return branch_name;
	}
	
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
}
