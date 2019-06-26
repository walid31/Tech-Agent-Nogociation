
public class Bidding {

	String raise;
	String maxPrice;
	
	public Bidding(String raise, String maxPrice) {
		super();
		this.raise = raise;
		this.maxPrice = maxPrice;
	}

	public Bidding() {
		super();
	}

	public String getRaise() {
		return raise;
	}

	public void setRaise(String raise) {
		this.raise = raise;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}
	
	
}
