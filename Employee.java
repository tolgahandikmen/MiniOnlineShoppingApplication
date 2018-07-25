import java.util.Date;

public class Employee extends Person {
	
	private double salary;
	public Employee(String name, String email, Date birthday, double salary){
		super(name,email,birthday);
		this.setSalary(salary);
	}
	public Employee(){
		
	}

	public double getSalary() {
		return salary;
	}
	public String getPassword(){
		return null;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setPassword(String password) {
		
	}	
	public boolean getSenior() {
		return true;
	}
	public void setSenior(boolean senior) {
		
	}
}
