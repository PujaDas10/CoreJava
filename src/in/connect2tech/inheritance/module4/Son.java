package in.connect2tech.inheritance.module4;

public class Son extends Father{
	
	public void enthusiatic() {
		System.out.println("Has great enthusiasm.");
	}

	public static void main(String[] args) {
		
		Son s = new Son();
		s.cares();
		s.responsible();
		s.enthusiatic();

	}

}
