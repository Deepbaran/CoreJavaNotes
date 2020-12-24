package classes_and_objects;

public class Student {
	// properties of the student class
	public String name; // null is assigned as default
	// final data members can be initialized as soon as they are declared
	private final int rollNumber; // 0 is assigned by default if data member is not final
	private static int numStudents; // Initialized automatically with 0
	
	// our own constructor that acts like a default constructor
//	public Student() { // constructor 1
//		rollNumber = 100;
//	}
	
//	public Student(String n) { // Constructor 2
//		name = n;
//	}
	
	// constructor
	public Student(String name, int rollNumber) { // Constructor 3
		this.name = name;
		this.rollNumber = rollNumber;
		System.out.println(this);
		numStudents++;
	}
	
	// getter
//	public int getRollNumber() {
//		return rollNumber;
//	}
	
	// setter
//	public void setRollNumber(int rollNumber) {
//		if(rollNumber <= 0) {
//			return;
//		}
//		this.rollNumber = rollNumber;
//	}
		
	public static int getNumStudents() {
		return numStudents;
	}

	public static void setNumStudents(int numStudents) {
		Student.numStudents = numStudents;
	}
	
	public void print() {
		System.out.println(name + " " + rollNumber);
	}

}

/*
 * *****************************************************************************************************************************
 * The Object class is the parent class of all the classes in java by default. In other words, it is the topmost class of java.
 * 
 * reference variables are stored in the heap memory and the privitive data types are stored in the stak memory.
 * new keyword is used to access the heap memory and also to create reference variables.
 * *****************************************************************************************************************************
 * data members of class are generally default/friendly(if nothing is written).
 * 
 * default ->  these properties are accessible within the same package (not visible outside of the package)
 * private -> cannot be accessed outside of class (not visible outside of the class) 
 * public -> can be accessed from anywhere (visible everywhere)
 * 
 * There can be only one public class inside a .java file and it will contain the main method.
 * 
 * we use getters and setters to access private data members from outside
 * By using getters and setters, we can control the input and output of the user.
 * 
 * ******************************************************************************************************************************
 * constructor: A constructor is a function that basically let us create a new object
 * 
 * Every java class has a default constructor that takes no input
 * We can make our own constructors
 * Once we create our own constructor, the default constructor gets replaced and we can no longer access it
 * We can make more than one constructor in a class
 * Which constructor is called is decided by the input that is passed during the time of object creation
 * This is called CONSTRUCTOR OVERLOADING
 * 
 *********************************************************************************************************************************
 * final -> any data member that is finalized, once initialized, can no longer be changed 
 * 
 * we can not call constructor on an existing object
 * That is, for every object we can call the constructor once and that is, absolutely at the beginning to construct the object
 * As, constructor can be called once for every object, we can initialize final in the constructor
 * final data members must be initialized
 * We can initialize a final data member in two places, one is at the time of creation or in a constructor
 * And Java forces us to use initialize a final data member in the constructor if not initialized at the time of creation
 * Every constructor must initialize the final data members
 * 
 * ********************************************************************************************************************************
 * this -> this is the object that we are constructing. 
 * 
 * So, this keyword works as a reference to the current Object whose Method or constructor is being invoked
 * 
 * using "this" we can access the object and it's data member from inside it
 * "this" is a reference to the object
 * 
 * ********************************************************************************************************************************
 * static -> static members belong to the class and not to a particular object
 * 
 * static data members are shared by every every object of the class
 * No object will have their own static data member rather they will have the same static data member
 * So, if one object updates the static data member, then that static data member will be updated for all the objects of that class
 * Because static data members belong to the whole class and not to a particular object
 * Objects will not have their own copy of the static data member, rather they will share a single static data member among themselves
 * We can access the static member through any object but we will have the same value regardless of the object
 * Because, the value of static member does not depend on the object.
 * So, it is better to access a static data member through the class itself rather than a object of the class
 * 
 * Other data members that are not static belong to the object and not the class
 * To access them we need to use their respective objects as each object have their own copy of non static data members
 * 
 * static functions do not depend on the object. They belong to the class and we can access it through the class 
 * We can access static function through the objects but we should not.
 * static keyword is bound to the class and not to an individual object, thus we can�t make constructors static.
 * 
 * *********************************************************************************************************************************
 * 
 * The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
 *
 * The instanceof in java is also known as type comparison operator because it compares the instance with type. It returns either true or false. 
 * If we apply the instanceof operator with any variable that has null value, it returns false.
 * 
 * Example:
 * 
 * class Simple1{  
 *     public static void main(String args[]){  
 *         Simple1 s=new Simple1();  
 *         System.out.println(s instanceof Simple1);//true  
 *     }  
 * } 
 * 
 */


/*

By default Java puts 0 to it's uninitialized int member, 0.0 to uninitialized double variables
and stores null to uninitialized objects.

By putting Getters and Setters and not letting the user directly access the member variables, we can restrict user from adding invalid values to member variables
and we can also add logic.

*****************************************************************
Four Major Principles of OOP:
1. Encapsulation:
Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. 
In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. 
Therefore, it is also known as data hiding.

2. Abstraction:
Object-oriented programming, abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user. 
In other words, the user will have the information on what the object does instead of how it does it.
In Java, abstraction is achieved using Abstract classes and interfaces.

3. Inheritance:
Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another. With the use of inheritance the information is made manageable in a hierarchical order.
The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose properties are inherited is known as superclass (base class, parent class).

4. Polymorphism:
Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

*****************************************************
Access Modifiers:

1. private: Visible to the class only.
2. public: Visible to the world.
3. protected: Visible to the package and all the subclasses.
4. Default: Visible to the package. No modifiers are needed.

****************************************************

Constructors:
A constructor initializes an object when it is created. 
It has the same name as its class and is syntactically similar to a method. 
However, constructors have no explicit return type.
All classes have constructors, whether you define one or not, because Java automatically provides a default constructor that initializes all member variables to zero. 
However, once you define your own constructor, the default constructor is no longer used.

There are two types of Constructors in Java:
1. No argument Constructors
2. Parameterized Constructors

 */

/*

class Planet {

name, location, distanceFromSun // data/state/fields

revolve(), rotate() //actions/behavior/methods

}



Planet earth = new Planet();

Planet venus = new Planet();



1. Class: A class is a template that defines what are the data that an object can have and what are the actions that can be performed on an object.



2. Objects/Instances: An object is an instance of a class.



3. Member Data/State/Fields: Member data are data that are present for every object and every object can have different values for each Member Data.



4.Actions/Methods/Behavior: Methods represent actions. That can be performed on a specific object. This is called the behaviour of a class. 
So, the behavior of a class are actions that can be performed on its objects.

*/
