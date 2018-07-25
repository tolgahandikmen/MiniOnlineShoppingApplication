import java.util.Date;

public class Admin extends Employee {
	
	private String password;
	
	public Admin(String name,String email,Date birthday,double salary,String password){
		super(name,email,birthday,salary);
		this.setPassword(password);

	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
