package file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\MyFile.txt");
		int i;
		while((i=fr.read()) != -1) { //-1= last letter/eof
			System.out.print((char)i);
		}
		fr.close();
	}
}
