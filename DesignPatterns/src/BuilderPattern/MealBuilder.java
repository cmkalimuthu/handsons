package BuilderPattern;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meals=new Meal();
		meals.addItems(new VegBurger());
		meals.addItems(new Coke());
		return meals;
	}
	public Meal prepareNonVegMeal() {
		Meal meals=new Meal();
		meals.addItems(new ChickenBurger());
		meals.addItems(new Pepsi());
		return meals;
	}
}
