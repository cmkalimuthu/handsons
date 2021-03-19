package mediatorPattern;

public class Test {

	public static void main(String[] args) {
		
		ChatMediator mediator=new ChatMediatorImpl();
		User b1=new BasicUser("kali",mediator); 
		User b2=new BasicUser("kumar",mediator); 
		User b3=new BasicUser("hitesh",mediator); 
		
		mediator.Adduser(b1);
		mediator.Adduser(b2);
		mediator.Adduser(b3);
		
		b2.SendMessage("hey guys");
		
	}
}
