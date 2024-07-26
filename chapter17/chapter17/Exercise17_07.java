package chapter17;

import java.io.*;

public class Exercise17_07 {
    public static void main(String[] args) throws FileNotFoundException {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);
        
        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));
        ) {
            output.writeObject(loan1);
            output.writeObject(loan2);
        } 
        catch (IOException ex) {
            System.out.println("File could not be opened");
        }
        
        outputData("Exercise17_07.dat");
        
        
    }
    
    public static void outputData (String string) {
    	
    	Loan loan = null;
    	int i = 1;

    	try {

    		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(string));
    		try {
				while (true) {
    			loan = (Loan)ois.readObject();
				System.out.print("Total loan amount of loan " + i + ": " + loan.getLoanAmount() + "\n");
				i++;
				}
			} catch (ClassNotFoundException e) {
				System.out.print("File not Found");
			}
    		
    	} catch (IOException e) {
			// TODO Auto-generated catch block

		}    	
    }
    
}
