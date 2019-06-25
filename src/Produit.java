import jade.util.leap.Serializable;

public class Produit implements Serializable{
	
	double prix;
	String nomProduit;
	
	public Produit() {
		super();
	}

	public Produit(double prix, String nomProduit) {
		super();
		this.prix = prix;
		this.nomProduit = nomProduit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	
	
}
