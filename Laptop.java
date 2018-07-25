
public class Laptop extends Computer {
	
	private boolean hdmlSupport;
	public Laptop(int cost,String manufacturer,String brand,int maxVolt,int maxWatt,String operatingSystem,String cpuType,int ramCapacity,int hddCapacity,int hdmlSupport,int itemId){
		super(cost,manufacturer,brand,maxVolt,maxWatt,operatingSystem,cpuType,ramCapacity,hddCapacity,itemId);
		if(hdmlSupport==1){
			this.setHdmlSupport(true);
		}else{
			this.setHdmlSupport(false);
		}
		
	}
	public boolean isHdmlSupport() {
		return hdmlSupport;
	}

	public void setHdmlSupport(boolean hdmlSupport) {
		this.hdmlSupport = hdmlSupport;
	}

}
