package patterns;

public class P23 {

	public static void main(String[] args) {
		
		int row=4;
		int col=4;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
					if(i==0 && (j==0 || j==1||j==2||j==3)||i==1 && (j==1||j==2 ||j==3)|| i==2&&(j==2||j==3)||i==3&&(j==3))
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
					
			}
		}System.out.println();
	}
}
