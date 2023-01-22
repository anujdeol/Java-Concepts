package OOPS;

public class PolyM {

	String name;
	String shape;
	int salary;

	public void Check() {
		System.out.println("This is polymorphism " + name + " " + shape + "" + salary);
	}

	public PolyM() {

	}

	public PolyM(String name, String shape, int salary) {
		this.name = name;
		this.shape = shape;
		this.salary = salary;

	}

	public PolyM(String name, int salary) {
		this.name = name;
		this.salary = salary;

	}
	
	public void Write() {
		System.out.println("This is a test " +name+ " "+shape+" "+salary);
	}

	public static void main(String[] args) {
		PolyM obj1 = new PolyM();
		PolyM obj2 = new PolyM("First", 1);
		PolyM obj3 = new PolyM("Secoind", "triangle", 34);
		
		obj1.Write();
		obj2.Write();
		obj3.Write();
		
		
		
		
		

	}

}
