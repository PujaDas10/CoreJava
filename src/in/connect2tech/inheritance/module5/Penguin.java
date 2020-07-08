package in.connect2tech.inheritance.module5;

public class Penguin extends Bird {
	
	public void swim()
	{
		System.out.println("It can swim very efficiently");
	}
	public void habitat()
	{
		System.out.println("It's natural habitat is in the Southern Hemisphere");
	}

	public static void main(String[] args) {
		
		Penguin p = new Penguin();
		System.out.println("Description of a Penguin :");
		System.out.println("Wings :"+p.wings);
		System.out.println("Legs :"+p.legs);
		p.feathers();
		p.swim();
		p.habitat();

	}

}
