/*
 * Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. 
 * This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.
 * This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.
 */

package patterns.structural;

public class Facade {

	public static void main(String[] args) {
		Shape1Maker Shape1Maker = new Shape1Maker();

		Shape1Maker.drawCircle1();
		Shape1Maker.drawRectangle();
		Shape1Maker.drawSquare();
	}

}

class Shape1Maker {
	private Shape1 Circle1;
	private Shape1 rectangle;
	private Shape1 square;

	public Shape1Maker() {
		Circle1 = new Circle1();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle1() {
		Circle1.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}

interface Shape1 {
	void draw();
}

class Rectangle implements Shape1 {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}

class Square implements Shape1 {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}
}

class Circle1 implements Shape1 {

	@Override
	public void draw() {
		System.out.println("Circle1::draw()");
	}
}