package in.connect2tech.inheritance.module5;

public class Eagle extends Bird {
	
	public void fly()
	{
		System.out.println("It can fly very high up in the sky.");
	}
	public void vission()
	{
		System.out.println("It has a very strong vission.");
	}
	public static void main(String[] args) {
		
		Eagle e = new Eagle();
		System.out.println("Description of an Eagle :");
		System.out.println("Wings :"+e.wings);
		System.out.println("Legs :"+e.legs);
		e.feathers();
		e.fly();
		e.vission();

	}

}
