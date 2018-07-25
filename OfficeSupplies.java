
public class OfficeSupplies extends Items {
	
	private int releaseDate;
	private String coverTitle;
	public OfficeSupplies(int cost,int realeaseDate,String coverTitle,int itemId){
		super(cost,itemId);
		this.setReleaseDate(realeaseDate);
		this.setCoverTitle(coverTitle);
	}
	public OfficeSupplies(){
		
	}
	public String getCoverTitle() {
		return coverTitle;
	}
	public void setCoverTitle(String coverTitle) {
		this.coverTitle = coverTitle;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
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
