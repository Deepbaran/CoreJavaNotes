/*
 * ObserverClass pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically. 
 * ObserverClass pattern falls under behavioral pattern category.
 */

package patterns.behavioral;

import java.util.ArrayList;
import java.util.List;

public class Observer {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserverClass(subject);
		new OctalObserverClass(subject);
		new BinaryObserverClass(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}

}

abstract class ObserverClass {
	protected Subject subject;

	public abstract void update();
}

class BinaryObserverClass extends ObserverClass {

	public BinaryObserverClass(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}

class OctalObserverClass extends ObserverClass {

	public OctalObserverClass(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}
}

class HexaObserverClass extends ObserverClass {

	public HexaObserverClass(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}
}

class Subject {

	private List<ObserverClass> ObserverClasss = new ArrayList<ObserverClass>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObserverClasss();
	}

	public void attach(ObserverClass ObserverClass) {
		ObserverClasss.add(ObserverClass);
	}

	public void notifyAllObserverClasss() {
		for (ObserverClass ObserverClass : ObserverClasss) {
			ObserverClass.update();
		}
	}
}