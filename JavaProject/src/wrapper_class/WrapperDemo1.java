package wrapper_class;

public class WrapperDemo1 {

	public static void main(String[] args) {
		
		String str1="100";
		String str2="200";
		String str3="100.55";
		String str4="200.78";
		String str5="2004.678";
		String str6="2004.678";
		
		System.out.println("Total is "+ (Integer.parseInt(str1) + Integer.parseInt(str2)) );
		System.out.println("Total is "+ (Float.parseFloat(str3) + Float.parseFloat(str4)) );
		System.out.println("Total is "+ (Double.parseDouble(str5) + Double.parseDouble(str6)) );
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);//Maximum Range
		System.out.println("-----------------------------------");
		System.out.println(Integer.MAX_VALUE);//Minimum Range
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
	}
}
