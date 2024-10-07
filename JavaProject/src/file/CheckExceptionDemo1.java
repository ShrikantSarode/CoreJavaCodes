package file;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckExceptionDemo1 {

	public static void main(String[] args)  {
		try {
			FileInputStream file = new FileInputStream("//D:\\MyFile12.txt");
			int k;
			while ((k = file.read()) != -1) { // != -1 means read till end of the file.
				System.out.print((char) k);
			}
			System.out.println("reading successful");
			file.close();

		} catch (IOException e) {
			System.out.println("Path is wrong");
		}
	}
}
