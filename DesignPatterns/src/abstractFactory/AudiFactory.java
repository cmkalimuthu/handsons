package abstractFactory;

public class AudiFactory implements Factory{

	@Override
	public void producecomponents() {
		AudiTire t=new AudiTire();
		t.makeTire();
		AudiHeadLight m=new AudiHeadLight();
		m.makeHeadlight();
	}

}
