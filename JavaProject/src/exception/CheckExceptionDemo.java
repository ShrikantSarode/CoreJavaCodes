package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckExceptionDemo {

	public static void main(String[] args) throws IOException {
	
			FileInputStream file = new FileInputStream("//D:\\MyFile.txt");
			int k;
			while ((k = file.read()) != -1) { // != -1 means read till end of the file.
				System.out.print((char) k);
			
			System.out.println("reading successful");
			file.close();

		} 
	}
}
