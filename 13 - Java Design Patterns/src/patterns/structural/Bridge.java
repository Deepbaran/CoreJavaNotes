/*
 * Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. 
 * This type of design pattern comes under structural pattern as this pattern decouples implementation class and abstract class by providing a bridge structure between them.
 * This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. 
 * Both types of classes can be altered structurally without affecting each other.
 */

package patterns.structural;

public class Bridge {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}

}

// Create bridge implementer interface.
interface DrawAPI {
	public void drawCircle(int radius, int x, int y);
}

// Create concrete bridge implementer classes implementing the DrawAPI interface.
class RedCircle implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}

class GreenCircle implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}

// Create an abstract class Shape using the DrawAPI interface.
abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}

// Create concrete class implementing the Shape interface.
class Circle extends Shape {
	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}
