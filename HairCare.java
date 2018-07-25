
public class HairCare extends Cosmetic {

	private boolean medicated;

	public HairCare(int cost, String manufacturer, String brand, int organic, int weight, int date, int medicated,int itemId) {
		super(cost, manufacturer, brand, organic, weight, date,itemId);
		if (medicated == 1) {
			this.setMedicated(true);
		} else {
			this.setMedicated(false);
		}
	}

	public boolean getMedicated() {
		return medicated;
	}

	public void setMedicated(boolean medicated) {
		this.medicated = medicated;
	}

}
