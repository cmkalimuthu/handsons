package adapterPattern;

public class Test {

	public static void main(String[] args) {
		Bugativeron b=new Bugativeron();
		MovableAdapter m=new MovableAdapterImpl(b);
		System.out.println("converted speed in kmph "+m.getSpeed()+" kmph");
		System.out.println("converted price in euro "+m.getPrice()+" Euro");
	}
}
