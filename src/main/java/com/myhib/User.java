package com.myhib;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="id")
    private int userId;
	@Column(name="name")
    private String username;
	@Column(name="password")
	private String userpassword;

	public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
        return userId;
    }
 

    public User(){}
    public User(String username, String userpassword) {
		super();
		this.username = username;
		this.userpassword = userpassword;
	}
 
    
}
