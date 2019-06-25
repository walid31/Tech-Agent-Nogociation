import jade.util.leap.Serializable;

public class Product implements Serializable{
	
	double price;
	String nameProduct;
	
	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product() {
		super();
	}

	
}