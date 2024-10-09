package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Test{
	private String s;
	public Test() {
		s="Hello World";
	}
	public void method1() {
		System.out.println("The String is "+s);
	}
	public void method2(int n) {
		System.out.println("The Number is "+n);
	}
	private void method3() {
		System.out.println("Private method invoke ");
	}
}

public class ReflectionDemo {

	
	public static void main(String[] args) throws Exception{
		Test t = new Test();
		Class cls = t.getClass();
		
		System.out.println("The name of class is "+cls.getName());
		
		Constructor constructor = cls.getConstructor();
		System.out.println("This is constructor "+constructor.getName());
		
		Method[] methods = cls.getMethods();
		
		for(Method a : methods) {
			System.out.println(a.getName());
		}
		System.out.println("================================");
	
	
		Method methodcall1 = cls.getDeclaredMethod("method2",int.class);
		//						             		name		para
		methodcall1.invoke(t,22);//execute the method2
		//contructor values
		Field field = cls.getDeclaredField("s");//mv s:1
		field.setAccessible(true);//making it public
		field.set(t, "JAVA");
		

		Method methodcall2 = cls.getDeclaredMethod("method1");
		methodcall2.invoke(t);

		Method methodcall3 = cls.getDeclaredMethod("method3");
		methodcall3.setAccessible(true);
		methodcall3.invoke(t);
		
	}
}
