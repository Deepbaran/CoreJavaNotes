/*
 * In StrategyClass pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern.
 * In StrategyClass pattern, we create objects which represent various strategies and a context object whose behavior varies as per its StrategyClass object. 
 * The StrategyClass object changes the executing algorithm of the context object.
 */

package patterns.behavioral;

public class Strategy {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategyClass(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategyClass(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategyClass(10, 5));
	}

}

class Context {
	private StrategyClass StrategyClass;

	public Context(StrategyClass StrategyClass) {
		this.StrategyClass = StrategyClass;
	}

	public int executeStrategyClass(int num1, int num2) {
		return StrategyClass.doOperation(num1, num2);
	}
}

interface StrategyClass {
	public int doOperation(int num1, int num2);
}

class OperationAdd implements StrategyClass {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}

class OperationSubstract implements StrategyClass {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}

class OperationMultiply implements StrategyClass {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}