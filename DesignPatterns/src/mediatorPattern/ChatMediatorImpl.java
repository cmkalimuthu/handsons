package mediatorPattern;

import java.util.ArrayList;

public class ChatMediatorImpl implements ChatMediator{
	
	private User user;
	private ArrayList<User> list;
	
	
	public ChatMediatorImpl() {
		this.list=new ArrayList<>();
	}

	@Override
	public void Adduser(User user) {
		// TODO Auto-generated method stub
		this.list.add(user);
	}

	@Override
	public void sendMessage(String msg,User user) {

		for(User user1:this.list) {
			if(user1!=user)
			user1.RecieveMessage(msg);
		}
	}

}
