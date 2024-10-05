package assignment7;

public class StringTokenizer {

	public static void main(String[] args) {
		
		String str="Java,Python ,Javascript";
		String[] token= str.split(",");
		
		for(String tokens:token) {
			System.out.println(tokens);
		}
	}
}
