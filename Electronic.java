
public class Electronic extends Items{
	
	private int maxInVolt, maxPowCons;
	private String manufacturer,brand;
	
	public Electronic(double cost,String manufacturer,String brand,int maxVolt,int maxWatt,int itemId){
		super(cost,itemId);
		this.setManufacturer(manufacturer);
		this.setMaxInVolt(maxVolt);
		this.setMaxPowCons(maxWatt);
		this.setBrand(brand);
	}
	public Electronic(){
		
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public int getMaxInVolt() {
		return maxInVolt;
	}

	public void setMaxInVolt(int maxInVolt) {
		this.maxInVolt = maxInVolt;
	}

	public int getMaxPowCons() {
		return maxPowCons;
	}

	public void setMaxPowCons(int maxPowCons) {
		this.maxPowCons = maxPowCons;
	}
	public String getBoxColor() {
		return null;
	}

	public void setBoxColor(String boxColor) {
	}
	public boolean isHdmlSupport() {
		return false;
	}

	public void setHdmlSupport(boolean hdmlSupport) {
	
	}
	public int getDimension() {
		return 0;
	}

	public void setDimension(int dimension) {
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
