package inheritance;

public class TestPerson1 {

	public static void main(String[] args) {
		
		Person[] arr=new Person[5];
		
		arr[0]= new Person("Shrikant", 22, 'M');
		arr[1]= new Person("Ajay", 22, 'M');
		arr[2]= new Person("Dhanya", 22, 'M');
		arr[3]= new Person("Sudharshan", 22, 'M');
		arr[4]= new Person("Ashvini", 21, 'F');
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getName()+" is "+arr[i].getAge()+" year old and gender is "+arr[i].getGender());
		}
		
		
		
	}
}
