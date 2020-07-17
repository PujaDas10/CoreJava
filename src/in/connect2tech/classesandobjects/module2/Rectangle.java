package in.connect2tech.classesandobjects.module2;


public class Rectangle {
	
	double length;
	double breadth;

	public void showarea() {
		
		double area;
		area = length * breadth;
		System.out.println(" Area :" +area);
	}
	
	public static void main(String[] args) {
		
		Rectangle a = new Rectangle();
		Rectangle b = new Rectangle();
		
		a.length = 3.5;
		a.breadth = 5.3;
		b.length = 5.0;
		b.breadth = 5.0;
		
		System.out.println(" Rectangle a :");
		System.out.println(" Length :" +a.length);
		System.out.println(" Breadth :" +a.breadth);
		a.showarea();
		System.out.println(" Rectangle b :");
		System.out.println(" Length :" +b.length);
		System.out.println(" Breadth :" +b.breadth);
		b.showarea();
	}
}
