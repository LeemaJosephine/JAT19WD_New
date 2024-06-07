package day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CheckedExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\Digital Suppliers\\eclipse-workspace\\JAT19WD\\src\\day15\\samp.txt");
			try {
				file.write(12);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Check the file path");	
			
		} 
		
//		String text ="Hello";
//		Path fileName = Path.of("C:\\Users\\Digital Suppliers\\eclipse-workspace\\JAT19WD\\src\\day15\\sample2.txt");
//		try {
//			Files.writeString(fileName, text);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Check the file path");
//		}
		
		System.out.println("End of program");
	}
}
