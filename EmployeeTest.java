package AllProgram;

public class EmployeeTest {
	
	int id;
	String name;
	double salary;
	
	EmployeeTest(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	void display()
	{

		System.out.println("Employee ID :"+ id);
		System.out.println("Employee Name :"+ name);
		System.out.println("Employee Salary :"+ salary);
		System.out.println();
		
	}
	
	public static void main(String args[]) {
		EmployeeTest emp1 = new EmployeeTest(115, "Rakecsh", 600000);
		EmployeeTest emp2 = new EmployeeTest(102,"STR", 700000);
		
		System.out.println("Employee  Detail :\n");

		System.out.println("Employee number 1 :\n");
		emp1.display();
		System.out.println("Employee number 2 :\n");
		emp2.display();
	}

}
