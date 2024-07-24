package Constructors;

// Constructors are used for the initialization of the object not for the creation of the object

public class Employee {
	
	int emp_id;
	String emp_name;
	
	Employee(int emp_id, String emp_name)
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Employee e1 = new Employee(1, "Eashika");
	Employee e2 = new Employee(2, "Singla");
	
	System.out.println("Employee 1: "+ e1.emp_id + " "+ e1.emp_name);
	System.out.println("Employee 2: "+ e2.emp_id + " "+ e2.emp_name);

	}

}
