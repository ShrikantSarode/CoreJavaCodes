package patterns;

public class P17 {

	public static void main(String[] args) {
		int row=5;
		int space=0;
		int star=5;
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int s=0;s<star;s++)
			{
				System.out.print(" *");
			}
			space++;
			star--;
			System.out.println();
		}
	}
}
