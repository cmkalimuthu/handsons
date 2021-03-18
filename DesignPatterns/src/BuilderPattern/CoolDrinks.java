package BuilderPattern;

public abstract class CoolDrinks implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
