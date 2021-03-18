package facadePattern;

public class FacadePatternDemo {

	public static void main(String[] args) {

		ShapeMaker sh=new ShapeMaker();
		sh.drawCircle();
		sh.drawRectange();
		sh.drawSquare();
	}

}
