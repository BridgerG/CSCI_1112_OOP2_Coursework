package chapter19_03.copy;

import java.util.ArrayList;

public class RemoveDupes {
	
	public static <T extends Comparable<T>> ArrayList<T> removeDupes (ArrayList<T> alist) {
		
		ArrayList<T> tno = new ArrayList<>();
		Boolean exist = true;
		
		tno.add(alist.get(0));

		for (int i = 0; i < alist.size(); i++) {
			
			exist = true;
			
			for(int a = 0; a < tno.size(); a++) {
				
				if (alist.get(i).compareTo(tno.get(a)) == 0) {
					
					exist = false;
					break;
					
				}
				
			}
			
			if(exist == true) {
				
				tno.add(alist.get(i));

			}
		}
		
		return tno;
		
	}
}
