package in.connect2tech.inheritance.module1;

public class Manager extends Employee {
	
	String designation="Manager";
	int allowances=20000;
	int bonus=10000;
	public void manages()
	{
		System.out.println("Responsible for coordinating all technical activities in an organization.");
	}

public static void main(String[] args) {
		Manager m = new Manager();
		m.details();
		System.out.println("Department of the employee: "+ m.department);
		System.out.println("Designation of the employee: "+ m.designation);
		System.out.println("Salary of the employee: "+ (m.salary + m.allowances + m.bonus) );
		m.manages();

	}
}
