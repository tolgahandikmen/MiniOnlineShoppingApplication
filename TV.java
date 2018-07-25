
public class TV extends Electronic {
	
	private int screenSize;
	public TV(){
		
	}
	public TV(int cost,String manufacturer,String brand,int maxVolt,int maxWatt,int screenSize,int itemId){
		super(cost,manufacturer,brand,maxVolt,maxWatt,itemId);
		this.setScreenSize(screenSize);

	}
	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

}
