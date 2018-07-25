
public class SkinCare extends Cosmetic {
	
	private boolean babySensivite;
	
	public SkinCare(int cost,String manufacturer,String brand,int organic,int weight,int date,int babySensivite,int itemId){
		super(cost,manufacturer,brand,organic,weight,date,itemId);
		if(babySensivite==1){
			this.setBabySensivite(true);
		}else{
			this.setBabySensivite(false);
		}

	}
	public boolean isBabySensivite() {
		return babySensivite;
	}

	public void setBabySensivite(boolean babySensivite) {
		this.babySensivite = babySensivite;
	}

}
