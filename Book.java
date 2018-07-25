

public class Book extends OfficeSupplies {
	
	private String publisher;
	private String[] author;
	private int pageNumber;

	public Book(int cost,int realeaseDate,String publisher,String coverTitle,String[] author,int pageNumber,int itemId){
		super(cost,realeaseDate,coverTitle,itemId);
		this.setPublisher(publisher);
		this.setAuthor(author);
		this.setPageNumber(pageNumber);
	}
	
	
	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String[] getAuthor() {
		return author;
	}

	public void setAuthor(String[] author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
