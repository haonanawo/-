package entity;

public class User {
    
    private String uname;
    private String upass;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public User() {
		super();
	}
	public User(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}

    
    
}
