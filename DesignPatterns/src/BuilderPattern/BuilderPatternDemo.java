package BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder m=new MealBuilder();
		Meal vegMeal=m.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonVegMeal=m.prepareNonVegMeal();
		System.out.println("Non Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
		
	}
	
}
