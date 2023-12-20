/* Write a Java program to create a class called Vehicle with a method called drive().
 Create a subclass called Car that overrides the drive() method to print "Repairing a car".*/

package Main;

class Vehicle{
	
	void drive() {
		
	}
}

class Car extends Vehicle{
	
	@Override
	void drive() {
		System.out.println("Repairing a car");
	}
}

public class Drive {
  
	public static void main(String args[]) {
		Vehicle vc = new Vehicle();
		Car cd = new Car();
		vc.drive();
		cd.drive();
		
	}
}
