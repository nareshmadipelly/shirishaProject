package JavaDemos;

public class staticDemo {

	
	static String Collegename="xyz";
	int rollno;
	String name;
	
	public staticDemo(int rollno,String name){
	
		this.rollno=rollno;
		
		this.name=name;
	}
	
	public static void collegeName(){
		Collegename="cbit";
	}
	
	public void display(){
		
		System.out.println(rollno +  ":" +name +" :" +Collegename);
	}
	
	public static void main(String[] args) {
		staticDemo.collegeName();
		staticDemo s1= new staticDemo(123,"s1");
		staticDemo s2= new staticDemo(234,"s2");
		s1.display();
		s2.display();
	}

}
