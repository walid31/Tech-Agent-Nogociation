import java.io.IOException;
import java.util.Scanner;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class Seller extends Agent {
    String name;
	Product product = new Product();
	ACLMessage msg;
	protected void setup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the name of the agent Vendeur :");
		name = sc.nextLine();
		
		System.out.println("\nEnter the name of the product :");
		product.nameProduct = sc.nextLine();
		
		System.out.println("\nEnter the name of the product :");
		product.price = sc.nextDouble();
		
		System.out.println("\nEnter the name of the product :");
		product.reservePrice = sc.nextDouble();
		
		msg = new ACLMessage(ACLMessage.INFORM);
		
	}
}
