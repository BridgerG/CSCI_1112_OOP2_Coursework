package Chapter19_09;

import java.util.ArrayList;

public class Chapter19_9 {

	public static void main(String[] args) {
		   
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(14);
		list.add(24);
		list.add(4);
		list.add(42);
		list.add(5);
    
		Chapter19_9.<Integer>sort(list);
    
		System.out.print(list);
	}

	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		
		ArrayList<E> sortedlist = new ArrayList<E>();
		E small = null;
		int remove = 0;
		
		while(list.size() > 0) {
			
			small = list.get(0);
			for(int i = 0; i < list.size(); i++) {
				
				if(list.get(i).compareTo(small) == -1) {
					
					remove = i;
					small = list.get(i);
						
				}				
			}
			
			list.remove(remove);
			sortedlist.add(small);
			remove = 0;
			
		}
		
		int i = 0;
		while(list.size() < sortedlist.size()) {
			
			list.add(sortedlist.get(i));
			i++;
			
		}
	}

}
