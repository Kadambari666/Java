/*Write a Java program to create a class called Employee with methods called work() and getSalary(). 
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
*/


package Main;

class Employee{
	
	void work() {
		
		System.out.println("This is Employee class's work method");
		
	}
	
	void getSalary() {
		
		System.out.println("This is the get salary method of employee class");
		
	}
	
}

class HRManager extends Employee{
	
	@Override
	void work() {
		
		System.out.println("This is the work method from subclass");
		
	}
	
	void addEmployee() {
		
		System.out.println("This is the new method from subclass");
	}
}

public class Management {
	
	public static void main(String args[]) {
		
		HRManager hrm = new HRManager();
		Employee em = new Employee();
		hrm.work();
		em.work();
		
	}

}
