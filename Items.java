
public class Items {
	
	private int itemID;/*sýrayla eklemen lazým 0,1,2,3,*/
	private double price;
//	private Person[] tookPerson;
	public Items(){
		
	}
	public Items(double price,int itemID){
		this.setPrice(price);
		this.setItemID(itemID);
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturer() {
		return null;
	}
	public void setManufacturer(String manufacturer) {
	
	}
	
	public int getMaxInVolt() {
		return 0;
	}

	public void setMaxInVolt(int maxInVolt) {
	
	}

	public int getMaxPowCons() {
		return 0;
	}

	public void setMaxPowCons(int maxPowCons) {
	
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
		return null;
	}
	public void setBrand(String brand) {
	
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
	public String getCoverTitle() {
		return null;
	}
	public void setCoverTitle(String coverTitle) {

	}
	public int getReleaseDate() {
		return 0;
	}
	public void setReleaseDate(int releaseDate) {

	}
	public int getPageNumber() {
		return 0;
	}

	public void setPageNumber(int pageNumber) {

	}

	public String[] getAuthor() {
		return null;
	}

	public void setAuthor(String[] author) {

	}

	public String getPublisher() {
		return null;
	}

	public void setPublisher(String publisher) {
		
	}
	public String[] getSongs() {
		return null;
	}
	public void setSongs(String[] songs) {
		
	}
	public String getComposer() {
		return null;
	}
	public void setComposer(String composer) {
		
	}
	
}
