package java;

public class superDemo extends superDemo1 {
	
	public void method1()
	{
		System.out.println("this is the sub methode");
	}
	public static void main(String[] args) {

		superDemo1 s =new superDemo1();
		s.method1();
	}

}
