
public class Desktop extends Computer {
	
	private String boxColor;
	public Desktop(double cost,String manufacturer,String brand,int maxVolt,int maxWatt,String operatingSystem,String cpuType,int ramCapacity,int hddCapacity,String boxColor,int itemId){
		super(cost,manufacturer,brand,maxVolt,maxWatt,operatingSystem,cpuType,ramCapacity,hddCapacity,itemId);
		this.setBoxColor(boxColor);
	}
	public String getBoxColor() {
		return boxColor;
	}

	public void setBoxColor(String boxColor) {
		this.boxColor = boxColor;
	}

}
