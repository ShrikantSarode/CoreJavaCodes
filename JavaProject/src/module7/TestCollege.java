package module7;

public class TestCollege {

	public static void main(String[] args) {
		
		College c1=new College("MET", 'A', "Nashik", "987898778");
		Stream stream1=new Stream("CDAC", 160000, 120); 
		Stream stream2=new Stream("CS", 120000, 60); 
		Stream stream3=new Stream("IT", 120000, 60); 
		Stream stream4=new Stream("Electrical", 100000, 60); 
		Stream stream5=new Stream("Civil", 110000, 30);
		
		
		System.out.println(c1);
		System.out.println(stream1);
		System.out.println(stream2);
		System.out.println(stream3);
		System.out.println(stream4);
		System.out.println(stream5);
				
	}
}
