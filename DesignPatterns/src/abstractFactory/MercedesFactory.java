package abstractFactory;

public class MercedesFactory implements Factory{

	@Override
	public void producecomponents() {
		// TODO Auto-generated method stub
		MercedesTire t=new MercedesTire();
		t.makeTire();
		MercedesHeadlight m=new MercedesHeadlight();
		m.makeHeadlight();
		
	}

	

}
