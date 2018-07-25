
public class CD_DVD extends OfficeSupplies {
	private String composer;
	private String[] songs;

	public CD_DVD(int cost, int realeaseDate, String coverTitle, String composer, String[] songs,int itemId) {
		super(cost, realeaseDate, coverTitle,itemId);
		this.setComposer(composer);
		this.setSongs(songs);
	}

	public String[] getSongs() {
		return songs;
	}

	public void setSongs(String[] songs) {
		this.songs = songs;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

}
