
public class SmartPhone extends Electronic {
	
	private String screenType;
	public SmartPhone(int cost,String manufacturer,String brand,int maxVolt,int maxWatt,String screenType,int itemId){
		super(cost,manufacturer,brand,maxVolt,maxWatt,itemId);
		this.setScreenType(screenType);

	}
	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

}
