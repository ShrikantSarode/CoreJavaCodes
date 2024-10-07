package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\MyFile.txt");

		FileReader fr = new FileReader(f);

		BufferedReader br = new BufferedReader(fr, 200);//200 is char each time to read

		 String str;
         while ((str = br.readLine()) != null) { // eof
             System.out.println(str);
         }
	}
}
