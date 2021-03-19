package observerPattern;

public class Main {

	public static void main(String[] args) {
		Publisher p=new Publisher();
		SubscriberOne s1=new SubscriberOne(p);
		SubscriberTwo s2=new SubscriberTwo(p);
		SubscriberThree s3=new SubscriberThree(p);
		System.out.println("first state ");
		p.setState("first message");
		p.detach(s3);
		System.out.println("Second state ");
//		p.attach(s3);
		p.setState("second message");
		
		
		
		
	}
}
