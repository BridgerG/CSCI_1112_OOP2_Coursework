package chapter17_14and15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String tbe = "";
		
		System.out.print("Write the name of the file you want to encrypt: ");
		String s = scan.next();
		File file1 = new File(s);
		
		System.out.print("Write the name of the new file you want the encrypted version of the above file to be put into: ");
		s = scan.next();
		File file2 = new File(s);
		
		
		try {
			
			RandomAccessFile raf = new RandomAccessFile(file1, "r");
			
			tbe = raf.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			
			RandomAccessFile raf = new RandomAccessFile(file2, "rw");

			byte[] b = tbe.getBytes();
			
			for (int i = 0; i != b.length; i ++) {
				
				b[i] += 5;
				raf.writeByte(b[i]);
				
			}
			
			
			//RandomAccessFile raf = new RandomAccessFile(file2, "rw");
			//raf.writeBytes(b.toString());			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
