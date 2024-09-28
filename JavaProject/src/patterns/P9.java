package patterns;

public class P9 {

	public static void main(String[] args) {
		
		int row=6;
		int col=1;
		
		for(int i=0;i<row;i++)
		{
			for(int j=1;j<col;j++)
			{
				System.out.print(" "+j%2);
			}
			col++;
			System.out.println();
		}
	}
}
