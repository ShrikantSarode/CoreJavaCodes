package module5;

public class UpwardCasting {

	public static void main(String[] args) {
		int a=100;
		double d=a;
		System.out.println(d);//UpwardCasting:automatic
		
		double b=66.99;
		int c=(int)b;
		System.out.println(c);//DownCasting
	}
}
