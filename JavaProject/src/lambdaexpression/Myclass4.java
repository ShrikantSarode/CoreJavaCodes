package lambdaexpression;
interface Interface4 {
	void absfun(int n);
}
public class Myclass4 {

	public static void main(String[] args) {
		Interface4 fobj = (int n)->{
			if(n%2==0) {
				System.out.println(n+" is Even");
			}else {
				System.out.println(n+" is Odd");
			}
		};
		fobj.absfun(5);
		fobj.absfun(10);
	}
}
