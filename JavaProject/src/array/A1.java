package array;

public class A1 {

	int max=0,sum=0,avg=0;
	
	public void max(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max: "+max);
	}
	
	public void sum(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum: "+sum);
	}
	
	public void avg(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			avg=sum/a.length;
		}
		System.out.println("Average: "+avg);
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		
		A1 o = new A1();
		o.sum(a);
		o.max(a);
		o.avg(a);
		
	}
}
