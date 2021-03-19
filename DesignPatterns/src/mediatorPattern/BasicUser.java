package mediatorPattern;

public class BasicUser implements User{
	
	private ChatMediator chat;
	private String name;
	
	
	public BasicUser(String name,ChatMediator chat) {
		this.name=name;
		this.chat=chat;
	}

	@Override
	public void RecieveMessage(String msg) {
		// TODO Auto-generated method stub
		
		System.out.println(this.name+" Recieved message  "+msg);
		
	}

	@Override
	public void SendMessage(String msg) {
		// TODO Auto-generated method stub
		chat.sendMessage(msg,this);
		
	}

}
