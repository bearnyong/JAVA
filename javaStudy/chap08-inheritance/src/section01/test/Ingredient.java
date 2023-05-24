package section01.test;

public class Ingredient {
	 
	private int water;  	//물
	private int riceCake;  	//떡
	private int sauce; 		//소스
	
	public Ingredient() {
	}

	public Ingredient(int water, int riceCake, int sauce) {
		super();
		this.water = water;
		this.riceCake = riceCake;
		this.sauce = sauce;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getRiceCake() {
		return riceCake;
	}

	public void setRiceCake(int riceCake) {
		this.riceCake = riceCake;
	}

	public int getSauce() {
		return sauce;
	}

	public void setSauce(int sauce) {
		this.sauce = sauce;
	}

	@Override
	public String toString() {
		return "재료 [ 물: " + water + "ml, 떡: " + riceCake + "g, 소스: " + sauce + "g ]";
	}

}
