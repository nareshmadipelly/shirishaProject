package JavaDemos;

public class objectCreation {

	public static void main(String[] args) {
		
		
		//className variableName = new ConstructorName();
		
		objectDemo mathOps = new objectDemo(1234);
		
		int additionOfTwoNumbers=mathOps.addtwoNumbers(19);
		
		System.out.println(additionOfTwoNumbers);
		mathOps.substractNumber();
	
	}

}
