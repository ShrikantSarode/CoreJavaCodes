package patterns;

public class P1 {

	public static void main(String[] args) {
		
		int row=6;
		int col=6;
		
		for(int i=1;i<row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
	}

}
