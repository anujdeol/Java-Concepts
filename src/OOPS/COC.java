package OOPS;

public class COC {
	String color;
	String type;
	int price;

	public COC(String color, String type, int price) {
		this.color=color;
		this.type=type;
		this.price=price;
	}
	public COC() {
		
	}
	public void write() {
		System.out.println("Defailt constructor " +color);
		
	}
	
	public static void main(String[] args) {
		COC obj1 = new COC();
		COC obj2 = new COC("blue","ball",5);
		obj1.write();
		obj2.write();
	}
	

	
	
	
}