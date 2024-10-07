package file;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WriteDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr= new FileReader("D:\\MyFile.txt");
		
		FileOutputStream out = new FileOutputStream("D:\\newFile.txt");
		
		int i;
		
		while((i=fr.read())!= -1) {
			out.write(i);
		}
	}

}
