package interfaces;

public interface CarInterface extends VehicleInterface{
	// data member of interfaces
	public final static double PI = 3.14;
	
	public String getCompany();
	// As none of the functions in VehicleInterface is implemented here, so we need to implement them at the sub-class
}

// An interface can extend another interface
// To store data members, the data members must be public final static
// Only for storing constants we will use data members in interfaces, otherwise we will not use data members