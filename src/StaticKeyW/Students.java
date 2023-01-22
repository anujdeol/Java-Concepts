package StaticKeyW;

public class Students {
	public String name;
	static String school;
	public String rollno;
	
	void printinfo(){
		System.out.println(" My name is "+name+" My school name is "+school+" Rol noi"+rollno);
	}
	public static void schoolchange() {
		school="abc";
	}
	
	
	public static void main(String[] args) {
		
		Students.school="SGRR";
		
//		We can access the school name by class name without creating object because itll comman for all the objects 
//		static keyword can be use in properties, fn, block, nested subclass
		Students s1 =new Students();
	
		s1.name="anuj";
		s1.rollno="qwerty";
		s1.schoolchange();
		s1.printinfo();
		Students s2 =new Students();

		s2.name="deol";
		s2.rollno="asxc";
		s2.schoolchange();
		s2.printinfo();
		
	}
}


