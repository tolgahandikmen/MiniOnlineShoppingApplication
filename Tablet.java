
public class Tablet extends Computer {
	
	private int dimension;

	public Tablet(double cost,String manufacturer,String brand,int maxVolt,int maxWatt,String operatingSystem,String cpuType,int ramCapacity,int hddCapacity,int dimension,int itemId){
		super(cost,manufacturer,brand,maxVolt,maxWatt,operatingSystem,cpuType,ramCapacity,hddCapacity,itemId);
		this.setDimension(dimension);
	}
	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

}
