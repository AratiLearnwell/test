package MethodOverriding;

public class Mainmethod {

	public static void main(String[] args)
	{
	Class1 c1=new Class1();
	Class2 c2=new Class2();
	Class3 c3=new Class3();
	Parent P =new Parent();
	
	c1.method();
	c2.method();
	c3.method();
	P.method();
	}

}
