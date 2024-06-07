package day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ThrowsSample {

	public void file() throws IOException, InterruptedException   {
		
		String text ="Hello";
		Path fileName = Path.of("C:\\Users\\Digital Suppliers\\eclipse-workspace\\JAT19WD\\src\\day13\\sample2.txt");
		Files.writeString(fileName, text);
		Thread.sleep(1000);
	}
	
	public void sample() throws IOException {
		
		try {
			file();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void sample1() {
		
		try {
			sample();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ThrowsSample obj = new ThrowsSample();
		obj.sample1();
		
	}

}
