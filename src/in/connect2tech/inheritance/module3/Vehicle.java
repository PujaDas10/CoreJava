package in.connect2tech.inheritance.module3;

public class Vehicle {
	
	String brand;
	String bodyType;
	String model;
	String fuelType;
	int speed;
	int seats;
	public Vehicle(String brand, String bodyType, String model, String fuelType, int speed , int seats)
	{
		this.brand=brand;
		this.bodyType=bodyType;
		this.model=model;
		this.fuelType=fuelType;
		this.speed=speed;
		this.seats=seats;
	}
	public void display_features() {
		System.out.println("Brand: "+ brand);
		System.out.println("Body Type: "+ bodyType);
		System.out.println("Model: "+ model);
		System.out.println("Fuel Type: "+ fuelType);
		System.out.println("Manual Speed: "+ speed);
		System.out.println("Seating Capacity: "+ seats);
	}
	

}
