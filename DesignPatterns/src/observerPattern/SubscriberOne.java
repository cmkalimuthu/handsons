package observerPattern;

public class SubscriberOne implements Observer{

	Publisher pub;
	SubscriberOne(Publisher pub){
		this.pub=pub;
		this.pub.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Subscriber one "+pub.getState());
	}

}
