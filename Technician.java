import java.util.Date;

public class Technician extends Employee {
	
	private boolean senior;
	
	public Technician(String name,String email,Date birthday,double salary,int is_senior){
		super(name,email,birthday,salary);
		if(is_senior==1){
			this.setSenior(true);
		}else{
			this.setSenior(false);
		}
	}
	
	public boolean getSenior() {
		return senior;
	}

	public void setSenior(boolean senior) {
		this.senior = senior;
	}

}
