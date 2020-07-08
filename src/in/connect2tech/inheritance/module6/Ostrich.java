package in.connect2tech.inheritance.module6;

public class Ostrich extends Birds{
	
	public void run() {
		System.out.println("It can run very fast");
	}
	public void fly()
	{
		System.out.println("It is a flightless bird");
	}

	public static void main(String[] args) {
		
		Ostrich o = new Ostrich();
		System.out.println("Description of an Ostrich :");
		System.out.println("Wings :"+o.wings);
		System.out.println("Legs :"+o.legs);
		o.feathers();
		o.run();
		o.fly();
		
		/*System.out.println("...............................................");
		Birds b = new Birds();
		b.fly();
		*/


	}

}

