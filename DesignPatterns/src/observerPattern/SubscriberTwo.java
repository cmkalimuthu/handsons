package observerPattern;

public class SubscriberTwo implements Observer{

	Publisher pub;
	SubscriberTwo(Publisher pub){
		this.pub=pub;
		this.pub.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Subscriber Two "+pub.getState());
	}

}
