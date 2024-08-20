package chapter18_9;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		reverseDisplay("LETS GET IT BOYS!!!");
		
	}
	
	public static void reverseDisplay(String value) {
		
		if (value.length() > 0) {
			
		
			char[] a = value.toCharArray();
			String replacement = ""; 
		
			System.out.print(a[a.length - 1]);
		
			for(int i = 0; i < a.length - 1; i++) {
			
			replacement = replacement + a[i];
			
			}
			
			reverseDisplay(replacement);
			
		} else {
			
		}
		
	}


}
