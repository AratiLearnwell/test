package Overloading;

public class Overloadingemethods 
{
void New()
{
	System.out.println("This is a method without arguments");
	
}

void New (int a, int b)
{
int x = a+b;
System.out.println("a+b = "+x);
}

void New (int a, String b)
{
	System.out.println("The arguments of this method are" +a);
	System.out.println("The string value is "+b);
}

void New (int x, int y ,int z)
{
int m = x+y+z;
System.out.println("x+y+z");

}
}


