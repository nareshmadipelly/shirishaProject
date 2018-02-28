package JavaDemos;

public class objectDemo {
	
	int x;
	
	public objectDemo(int a) {
		 x=a;
		 System.out.println(x);
	}
	
	
	
	public int addtwoNumbers(int a){
		
		System.out.println("this is addition method");
		int sum =a+100;
		sum=sum+x;
		return sum;
	}
	
	
	public void substractNumber(){
		System.out.println("this is substraction method");
	}

}
