package OOPS;

public class CopyC {

	String color;
	String type;
	int price;

	public CopyC(CopyC obj2) {
		this.color = obj2.color;
		this.type = obj2.type;
		this.price = obj2.price;
	}

	

	public void write() {
		System.out.println("Defailt constructor " + color);

	}
	public CopyC() {}

	public static void main(String[] args) {
		CopyC obj1 = new CopyC();
		obj1.color = "blue";
		obj1.type = "ball";
		obj1.price = 5;
		CopyC obj2 = new CopyC(obj1);
		
		obj2.write();

	}

}
