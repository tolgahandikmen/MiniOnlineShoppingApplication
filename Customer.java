import java.util.Date;

public class Customer extends Person {
	
	private int customerID;
	private String password, shoppingCart, orderHistory,status;
	private double balance;
	private Items[] itemsTaken = new Items[100];		//itemsTaken holds to who added something to cart
	
	public Customer(String name,String email,Date birthday,double balance,String password,int id){
		super(name,email,birthday);
		this.setPassword(password);
		this.setBalance(balance);
		this.setStatus("CLASSIC");
		this.setCustomerID(id);
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(String shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public String getOrderHistory() {
		return orderHistory;
	}
	public void setOrderHistory(String orderHistory) {
		this.orderHistory = orderHistory;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Items[] getItemsTaken() {
		return itemsTaken;
	}
	public void setItemsTaken(Items[] itemsTaken) {
		this.itemsTaken = itemsTaken;
	}

}
