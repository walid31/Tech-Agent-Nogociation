import java.io.IOException;
import java.util.Scanner;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Seller extends Agent {
    
	ACLMessage msg;
	protected void setup() {
		
		msg = new ACLMessage(ACLMessage.INFORM);
		
		try {
			Object[] args = getArguments();
			Product product = (Product)args[1];
			
			msg.addReceiver(new AID(msg.getSender().getLocalName(),AID.ISLOCALNAME));
			msg.setContentObject(product);
			msg.setLanguage("JavaSerialization");
			send(msg);
			System.out.println("test sur develop");
		}catch (IOException e) {e.printStackTrace(); }
		doDelete();
		
		addBehaviour(new CyclicBehaviour(this) {
			public void action() {
				ACLMessage Buymsg = new ACLMessage(ACLMessage.INFORM);
				Buymsg = receive();
				if(Buymsg != null) {
					System.out.println("I am : "+getLocalName()+" I received the message " + Buymsg.getContent() + " From "
				                                    + Buymsg.getSender().getLocalName());
					doDelete();
					Runtime.getRuntime().exit(Seller.AP_DELETED);
				}block();
			}
		}		
	);
		
	}
}
