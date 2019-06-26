import java.util.ArrayList;
import java.util.Scanner;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

public class MainContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {Runtime rt = Runtime.instance();
		Object[] argSeller = new Object[2];
		String nameSeller;
		Product product = new Product();
		
		Scanner sc = new Scanner(System.in);
		//================================= CREATE AGENT SELLER ================================
		System.out.println("\nEnter the name of the agent Seller :");
		nameSeller = sc.nextLine();
		
		System.out.println("\nEnter the name of the product :");
		product.setNameProduct(sc.nextLine());
		
		System.out.println("\nEnter the price :");
		product.setPrice(sc.nextFloat());
		
		System.out.println("\nEnter the reserved price :");
		product.setReservePrice(sc.nextFloat());
		
		argSeller[1] = product;
		
		//=======================================================================================
		
		Bidding bidding = new Bidding();
		String nameBuyer;
		Object[] argBuyer = new Object[2];
		
		//================================= CREATE AGENTS BUYER =================================
		System.out.println("\nEnter the name of the agent Buyer :");
		nameBuyer = sc.nextLine();
		
		System.out.println("\nEnter the raise :");
		bidding.setRaise(sc.nextFloat());
		
		System.out.println("\nEnter the max price :");
		bidding.setMaxPrice(sc.nextFloat());
		
		argBuyer[0] = nameBuyer;
		
		//=======================================================================================
		
		rt.setCloseVM(true);
			ProfileImpl p = new ProfileImpl("localhost",1099,null);
			ContainerController mc = rt.createMainContainer(p);
			/*
			ArrayList<AgentController> byeur = new ArrayList();
			liste.add(mc.createNewAgent("Walid", "Vendeur",null) );
			liste.get(liste.size()-1).start();
			*/
		
			AgentController ag1 = mc.createNewAgent(nameSeller, "Seller",argSeller);
			ag1.start();
			AgentController ag2 = mc.createNewAgent(nameBuyer, "Buyer",argBuyer);
			ag2.start();
		}catch (Exception e) {e.printStackTrace();}
	}

}
