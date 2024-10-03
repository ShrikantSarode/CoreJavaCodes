package string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Ashvini P");
		sb.insert(6, " New text ");
		System.out.println(sb);
		
		sb.delete(1, 5);
		System.out.println(sb);
		
		sb.replace(2, 3, "H");
		System.out.println(sb);
		
		
	}
}
