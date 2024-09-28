package patterns;

public class P11 {
	public static void main(String[] args) {
		
		int row=6;

		int space=5;
		int star=1;
		
		for(int i=0;i<row;i++)//row
		{
			
				for(int k=0;k<space;k++)//space
				{
					System.out.print(" ");
				}
				for(int l=0;l<star;l++)//star
				{
					System.out.print("*");
				}
				space--;
				star++;
			
			System.out.println();
		}
	}

}
