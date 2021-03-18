package facadePattern;

public class ShapeMaker {

	private Shape Circle;
	private Shape Rectangle;
	private Shape Square;
	
	public ShapeMaker() {
		Circle=new Circle();
		Rectangle=new Rectangle();
		Square=new Square();
	}
	void drawCircle() {
		Circle.draw();
	}
	void drawRectange() {
		Rectangle.draw();
	}
	void drawSquare() {
		Square.draw();
	}
}
