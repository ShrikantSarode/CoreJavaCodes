package module5;

public class CamparingString {
	
	public static void main(String[] args) {
		int a =100;
		int b=100;
		if(a==b)
		{
			System.out.println("Same");
		}
		
		String str1=new String("Shrikant");
		String str2=new String("Shrikant");
		String str3=new String("Shrikant");
		String str4=new String("SHRIKant");
		
		boolean c=str1.equals(str2);
		System.out.println(c);
		System.out.println("++++++++++");
		
		if(str1.equals(str2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
		if(str3.equalsIgnoreCase(str4))
		{
			System.out.println("same...............");
		}
		else
		{
			System.out.println("Not Same..........");
		}
		System.out.println("++++++++++");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i==5)
//				break;
				continue;
		
		}
		
		
		
		
	}

}
