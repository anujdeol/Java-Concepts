package OOPS;

public class PolyM1 {

	String name;
	String shape;
	int salary;

	public void Check() {
		System.out.println("This is first ");
	}
	
	public void Check(String name) {
		System.out.println("This is second ");
	}

	
	public void Check(String name, int salary) {
		System.out.println("This is third ");
	}


	public static void main(String[] args) {
		PolyM1 obj1 = new PolyM1();
		obj1.name = "Anuj";
		obj1.shape = "circle";
		obj1.salary = 80;
		
		obj1.Check();
		obj1.Check(obj1.name);
		obj1.Check(obj1.name, obj1.salary);
		
		
		
		
		

	}

}
