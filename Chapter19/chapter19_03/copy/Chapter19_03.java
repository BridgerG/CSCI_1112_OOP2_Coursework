package chapter19_03.copy;

import java.util.ArrayList;

public class Chapter19_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(14);
	    list.add(24);
		list.add(14);
	    list.add(42);
	    list.add(25);
			    
	    ArrayList<Integer> newList = RemoveDupes.removeDupes(list);
			    
	    System.out.print(newList);
	
	}
	
}


