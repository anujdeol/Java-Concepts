package Abst;

abstract class Animal {
	abstract void Walk();
	abstract void Talk();
	public void eat() {
		System.out.println("Eats food");
	}
	Animal(){
		System.out.println("Created a constructor1");
	}
}
