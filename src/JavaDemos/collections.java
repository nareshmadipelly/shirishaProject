package JavaDemos;

import java.util.ArrayList;
import java.util.HashMap;

public class collections {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list =new ArrayList<Integer>();  // [12,14,17] - [0][1][2]
		list.add(14);
		list.add(14);
		list.add(17);
		list.add(20);
		
		int newValue=add();
		list.add(newValue);
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		map.put(123, 1);
		map.put(123, 2);
		
		
		
		
		int value=map.get(123);
		
		System.out.println(value);
		
		
		
		for(int i=0;i<list.size();i++){
		
			int firstValue=list.get(i);
			System.out.println(firstValue);
			
			
		}
		
		
		
		
	}

	public static int add(){
		int c=10;
		return c;
	}
}
