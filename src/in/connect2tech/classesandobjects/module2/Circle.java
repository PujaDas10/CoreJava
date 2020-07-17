package in.connect2tech.classesandobjects.module2;

public class Circle {
	
	double radius;
	// Initializing the member variable
	public void setradius(double radius)
	{
		this.radius = radius;
	}
	// Fetching the member variable
	public double getradius()
	{
		return radius;
	}

	public static void main(String[] args) {
		
		Circle x = new Circle();
		x.setradius(5.05);
		System.out.println(" Radius of circle X =" +x.getradius());
		
		// Creating another object of the same class
		Circle y = new Circle();
		y.setradius(2.00);
		System.out.println(" Radius of circle  Y=" +y.getradius());
	}

}
