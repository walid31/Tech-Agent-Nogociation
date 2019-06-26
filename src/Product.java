import jade.util.leap.Serializable;

public class Product implements Serializable{
	
	float price;
	float reservePrice;
	String nameProduct;


	public float getReservePrice() {
		return reservePrice;
	}

	public void setReservePrice(float reservePrice) {
		this.reservePrice = reservePrice;
	}

		
	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Product() {
		super();
	}

	
}