package JavaDemos;

public class demoForDebug {

	public static void main(String[] args) {
		System.out.println("add two numbers");

		System.out.println("calling add method");
		
		add();
	}
	
	public static void add(){
		int a =10;
		int b= 30;
		int c = a+b;
		System.out.println(c);
	}

}
