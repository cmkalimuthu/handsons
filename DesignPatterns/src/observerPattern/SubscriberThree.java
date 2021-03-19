package observerPattern;

public class SubscriberThree implements Observer{

	Publisher pub;
	SubscriberThree(Publisher pub){
		this.pub=pub;
		this.pub.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Subscriber Three "+pub.getState());
	}

}
