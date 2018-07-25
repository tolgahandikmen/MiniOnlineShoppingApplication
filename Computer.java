
public class Computer extends Electronic {
	
	private String opSystem, cpuType;
	private int ramCapacity, hddCapacity;
	public Computer(){
		
	}
	public Computer(double cost,String manufacturer,String brand,int maxVolt,int maxWatt,String operatingSystem,String cpuType,int ramCapacity,int hddCapacity,int itemId){
		super(cost,manufacturer,brand,maxVolt,maxWatt,itemId);
		this.setOpSystem(operatingSystem);
		this.setCpuType(cpuType);
		this.setRamCapacity(ramCapacity);
		this.setHddCapacity(hddCapacity);
	}
	public String getOpSystem() {
		return opSystem;
	}
	public void setOpSystem(String opSystem) {
		this.opSystem = opSystem;
	}
	public int getRamCapacity() {
		return ramCapacity;
	}
	public void setRamCapacity(int ramCapacity) {
		this.ramCapacity = ramCapacity;
	}
	public String getCpuType() {
		return cpuType;
	}
	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}
	public int getHddCapacity() {
		return hddCapacity;
	}
	public void setHddCapacity(int hddCapacity) {
		this.hddCapacity = hddCapacity;
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
}
