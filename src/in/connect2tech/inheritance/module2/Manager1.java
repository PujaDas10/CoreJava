package in.connect2tech.inheritance.module2;

public class Manager1 extends Employee1 {
	
	 String designation;
	 int allowances;
	 int bonus;
	
	public Manager1(String department , int salary , String designation , int allowances , int bonus)
	{
		super(department , salary);
		this.designation = designation;
		this.allowances = allowances;
		this.bonus = bonus;	
	}
	public void manages()
	{
		System.out.println("Responsible for coordinating all technical activities in an organization.");
	}

	public static void main(String[] args) {
		
		Manager1 m1 = new Manager1("IT Services", 40000 , "Manager" , 20000 , 10000);
		m1.details();
		System.out.println("Department of the employee: "+ m1.department);
		System.out.println("Designation of the employee: "+ m1.designation);
		System.out.println("Salary of the employee: "+ (m1.salary + m1.allowances + m1.bonus) );
		m1.manages();

	}

}
