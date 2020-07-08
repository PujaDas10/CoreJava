package in.connect2tech.inheritance.module3;

public class Car extends Vehicle{
	
	int automatic_speed;
	public Car(String brand, String bodyType, String model, String fuelType, int speed , int seats, int automatic_speed)
	{
		super(brand, bodyType, model, fuelType, speed, seats);
		this.automatic_speed=automatic_speed;
	}

	public static void main(String[] args) {
		Car c = new Car("BMW", "SUV", "BMW X1", "Diesel", 7, 5, 8);
		c.display_features();
		System.out.println("Automatic Speed: "+ c.automatic_speed);
		

	}

}
