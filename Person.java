import java.util.Date;

public class Person {

	private String name, email;
	private Date birthday;


	public Person(String name,String email,Date birthday){
		this.setName(name);
		this.setEmail(email);
		this.setBirthday(birthday);
	}
	public Person(){
		
	}
	public String getPassword(){
		return null;
	}
	public double getSalary() {
		return 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setPassword(String password) {
		
	}	
	public void setSalary(double salary) {
	
	}
	public boolean getSenior() {
		return true;
	}
	public void setSenior(boolean senior) {
		
	}
	public int getCustomerID() {
		return 0;
	}
	public void setCustomerID(int customerID) {
	
	}
	public String getStatus() {
		return null;
	}
	public void setStatus(String status) {
	
	}
	public String getShoppingCart() {
		return null;
	}
	public void setShoppingCart(String shoppingCart) {
		
	}
	public String getOrderHistory() {
		return null;
	}
	public void setOrderHistory(String orderHistory) {
		
	}
	public double getBalance() {
		return 0;
	}
	public void setBalance(double balance) {
		
	}


}
