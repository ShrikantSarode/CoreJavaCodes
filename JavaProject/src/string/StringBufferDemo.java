package string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Ajay ");
		
		buffer.append("Shrikant");
		System.out.println(buffer);
		
		int i=buffer.indexOf("r");
		System.out.println("i index is "+i);
		
		int i1=buffer.lastIndexOf("t");
		System.out.println("i index is "+i1);
		
		buffer.replace(i, i1, "new");
		System.out.println(buffer);
		
		buffer.delete(i, i1);
					//  s   e	
		System.out.println(buffer);
		System.out.println(buffer.reverse());
		
	}
}
