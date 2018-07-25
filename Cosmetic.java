
public class Cosmetic extends Items {

	private int date;
	private int weight;
	private boolean organic;
	private String manufacturer, brand;

	public Cosmetic(int cost, String manufacturer, String brand, int organic, int weight, int date,int itemId) {
		super(cost,itemId);
		this.setBrand(brand);
		this.setManufacturer(manufacturer);
		if (organic == 1) {
			this.setOrganic(true);
		} else {
			this.setOrganic(false);
		}
		this.setDate(date);
		this.setWeight(weight);
	}

	public Cosmetic() {

	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public boolean getOrganic() {
		return organic;
	}

	public void setOrganic(boolean organic) {
		this.organic = organic;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isBabySensivite() {
		return true;
	}

	public void setBabySensivite(boolean babySensivite) {

	}

	public boolean getMedicated() {
		return true;
	}

	public void setMedicated(boolean medicated) {

	}

	public int getLastingDuration() {
		return 0;
	}

	public void setLastingDuration(int lastingDuration) {

	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

}
