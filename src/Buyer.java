import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;

import java.io.Serializable;
public class Buyer extends Agent {
	protected void setup() {
		addBehaviour(new CyclicBehaviour(this) {
			public void action () {
				ACLMessage Buymsg= receive();
				Product product;
				if(Buymsg!=null) {
					try {
						product=(Product)Buymsg.getContentObject();
						System.out.println("I am the agent " + getLocalName()+ " I received the product " + product.getNameProduct() +" from the agent " +Buymsg.getSender().getLocalName());
						doDelete();
					} catch (UnreadableException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}block();
			}
		});
	
	}
}
