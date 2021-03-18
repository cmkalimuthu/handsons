package adapterPattern;

public class MovableAdapterImpl implements MovableAdapter{

	private Movable luxurycars;
	
	MovableAdapterImpl(Movable luxurycars){
		this.luxurycars=luxurycars;
	}
	
	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return sppedConverter(luxurycars.getSpeed());
	}
	private double sppedConverter(double mph) {
		
		return mph*1.60934;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return convertUsd(luxurycars.getPrice());
	}

	public double convertUsd(double price) {
		// TODO Auto-generated method stub
		return price*0.84;
	}

}
