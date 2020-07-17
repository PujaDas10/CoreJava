package in.connect2tech.classesandobjects.module3;

public class Student {
	
	String name;
	int grade;
	String stream;
	int ID;	
	public Student(String name, int grade, String stream, int ID)
	{
		this.name = name;
		this.grade = grade;
		this.stream = stream;
		this.ID = ID;
	}
	public void details()
	{
		System.out.println("Students's Details :");
		System.out.println(" Name :" +name);
		System.out.println(" Grade :" +grade);
		System.out.println(" Stream :" +stream);
		System.out.println(" ID :" +ID);
	
	}


}