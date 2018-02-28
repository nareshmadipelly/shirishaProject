package JavaDemos;

import java.util.ArrayList;

public class dataTypesAndVariables {

	public static void main(String[] args) {
		
		
		boolean b =true;
		
		//String a="Naresh";
		int a=1;
		
		/*for(int x=1;x<=10;x++)
		{
			print(x);
		}*/
		// conditional statements 
		//for, if,else, if-else, switch, while, do while, 
		//for each loop
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("SELENIUM");
		list.add("java");
		list.add("python");
		
		for(String val : list)
		{
			if(val.equalsIgnoreCase("selenium"))
			{
				System.out.println("This is web automation lang.  :"+val);
			}
			else if(val.equalsIgnoreCase("java"))
			{
				System.out.println("This is best prog. lang. in the world "+val);
			}
			else
			{
				System.out.println("this is new prog.lang "+val);
			}
			
		}
		
		// while loop
		int z=100;
		while(z<=10)
		{
			System.out.println("Z val is " +z);
			z++;
		}
		
		// do while
		do
		{
			System.out.println("Val is " +z);
		
		}while(z<=10);
		
		// switch
		
		
		String s ="java";
		
		switch (s) 
		{
		case "selenium":
			
			if(s.contains("i"))
			{
				System.out.println("YES , I is there in selenium");
			}
			else{
				System.out.println("not matching");
			}
			
			break;
			
		case "java":
			
			if(s.contains("i"))
			{
				System.out.println("YES , I is there in selenium");
			}
			else{
				System.out.println("not matching");
			}
			
			break;
		
		case "python":
			System.out.println("THREE");
			break;

		default :
				System.out.println("some unknown number");
		}
		
		
		
	}
	
	public static void print(int a){
		System.out.println("print value");
		System.out.println(a);
		
	}

}
