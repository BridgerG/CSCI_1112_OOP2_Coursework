package chapter19_03;

import java.util.ArrayList;

public class Chapter19_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(5);
		a.add(6);
		a.add(5);
		a.add(10);
		a.add(7);
		a.add(6);

		ArrayList<Double> c = new ArrayList<>();
		
		c.add(5.3);
		c.add(6.5);
		c.add(5.3);
		c.add(10.0);
		c.add(7.2);
		c.add(6.5);
		
		ArrayList<String> d = new ArrayList<>();
		
		d.add("5.3");
		d.add("6.5");
		d.add("5.3");
		d.add("10.0");
		d.add("7.2");
		d.add("6.5");

		

		RemoveDupes b = new RemoveDupes();
		
		c = b.noDupes(c);
		a = b.noDupes(a);
		d = b.noDupes(d);

		System.out.println(a.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
	}
	
}
