
public class Bidding {

	float raise;
	float maxPrice;
	
	public Bidding(float raise, float maxPrice) {
		super();
		this.raise = raise;
		this.maxPrice = maxPrice;
	}

	public Bidding() {
		super();
	}

	public float getRaise() {
		return raise;
	}

	public void setRaise(float raise) {
		this.raise = raise;
	}

	public float getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(float maxPrice) {
		this.maxPrice = maxPrice;
	}
	
	
}
