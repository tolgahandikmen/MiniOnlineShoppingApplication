
public class Perfume extends Cosmetic {
	
	private int lastingDuration;

	public Perfume(int cost,String manufacturer,String brand,int organic,int weight,int date,int lastingDuration,int itemId){
		super(cost,manufacturer,brand,organic,weight,date,itemId);
		this.setLastingDuration(lastingDuration);
	}
	public int getLastingDuration() {
		return lastingDuration;
	}

	public void setLastingDuration(int lastingDuration) {
		this.lastingDuration = lastingDuration;
	}

}
