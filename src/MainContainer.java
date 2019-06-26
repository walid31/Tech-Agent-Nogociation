import java.util.ArrayList;
import java.util.Scanner;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

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
		
		
		
		//=======================================================================================
		Scanner sc1 = new Scanner(System.in);
		Bidding bidding = new Bidding();
		String nameBuyer;
		Object[] argBuyer = new Object[2];
		
		//================================= CREATE AGENTS BUYER =================================
		System.out.println("\nEnter the name of the agent Buyer :");
		nameBuyer = sc1.nextLine();
		
		System.out.println("\nEnter the raise :");
		bidding.setRaise(sc1.nextFloat());
		
		System.out.println("\nEnter the max price :");
		bidding.setMaxPrice(sc1.nextFloat());
		
		argBuyer[0] = nameBuyer;
		
		//=======================================================================================
		argBuyer[1] = product;
		rt.setCloseVM(true);
			ProfileImpl p = new ProfileImpl("localhost",1099,null);
			ContainerController mc = rt.createMainContainer(p);
			/*
			ArrayList<AgentController> byeur = new ArrayList();
			liste.add(mc.createNewAgent("Walid", "Vendeur",null) );
			liste.get(liste.size()-1).start();
			*/
		
			AgentController seller = mc.createNewAgent(nameSeller, "Seller",argBuyer);
			seller.start();
			AgentController buyer = mc.createNewAgent(nameBuyer, "Buyer",argBuyer);
			buyer.start();
		} catch (StaleProxyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
