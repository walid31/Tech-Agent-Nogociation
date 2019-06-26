import java.util.ArrayList;
import java.util.Scanner;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

public class MainContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Product product = new Product();
		Bidding bidding = new Bidding();
		
		try {Runtime rt = Runtime.instance();
		ProfileImpl p = new ProfileImpl("localhost",1099,null);
		ContainerController mc = rt.createMainContainer(p);
		Object[] argSeller = new Object[3];
		String nameSeller;
		
		
		String nameBuyer;
		Object[] argBuyer = new Object[2];
		ArrayList<AgentController> buyers = new ArrayList<AgentController>();
		
		Scanner sc = new Scanner(System.in);
		//================================= CREATE AGENT SELLER ================================
		System.out.println("\nEnter the name of the agent Seller :");
		nameSeller = sc.nextLine();
		
		System.out.println("\nEnter the name of the product :");
		product.setNameProduct(sc.nextLine());
		
		System.out.println("\nEnter the price of this agent:");
		product.setPrice(sc.nextFloat());
		
		System.out.println("\nEnter the reserved price of this agent:");
		product.setReservePrice(sc.nextFloat());
		
		argSeller[0] = product;
		
		
		
		//=======================================================================================
		
		
		
		//================================= CREATE AGENTS BUYER =================================
		ArrayList<String> listBuyers = new ArrayList<String>();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number of Buyers");
		String nbrBuyers = sc1.nextLine();
		for(int i = 0 ; i < Integer.valueOf(nbrBuyers).intValue() ; i++) {
			System.out.println("\nEnter the name of the agent Buyer :");
			
			listBuyers.add((String)sc1.nextLine()); 
			
			System.out.println("\nEnter the raise of this agent:");
			bidding.setRaise(sc1.nextLine());
			
			System.out.println("\nEnter the max price of this agent:");
			bidding.setMaxPrice(sc1.nextLine());
			
			argBuyer[0] = bidding;
			
			buyers.add(mc.createNewAgent(listBuyers.get(i),"Buyer",argBuyer));
			System.out.println("bebe");
			buyers.get(i).start();
		}
		argSeller[1] = listBuyers;
		AgentController seller = mc.createNewAgent(nameSeller, "Seller",argSeller);
		seller.start();
		
		//=======================================================================================
		
		rt.setCloseVM(true);
			/*
			ArrayList<AgentController> byeur = new ArrayList();
			liste.add(mc.createNewAgent("Walid", "Vendeur",null) );
			liste.get(liste.size()-1).start();
			*/
	    	
			
		}catch (Exception e) {e.printStackTrace();}
	}

}
