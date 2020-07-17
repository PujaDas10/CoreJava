package in.connect2tech.classesandobjects.module1;

class DemoHouse {
	
	int floors = 2;
	String colour = "Blue";
	String houseType = "Smart Home";
	public void opendoor() {
		System.out.println("Open door using password or fingerprint.");
	}
	public void controllights() {
		System.out.println("Turn on ligths and mange brightness using voice.");
	}
}
	
public class House{
	
	public static void main(String[] args) {
		
		DemoHouse A = new DemoHouse();
		System.out.println("House features : ");
		System.out.println("House Type :" + A.houseType);
		System.out.println("Colour :" + A.colour);
		System.out.println("No. of floors :" + A.floors);
		A.opendoor();
		A.controllights();
		
	}

}
