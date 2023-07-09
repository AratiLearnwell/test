package Selenium;

public class conditionalstatements
{

	public static void main(String[] args)
	{
		int x;
		int y;
		x=1;
		y=9;
		
		if (x<y)
		{
			System.out.println("The value of x is less then y");
		}
		
		else 
		{
			System.out.println("Sorry better luck next time");
		}
		
	int marks = 90;
		
		if (marks>=75)
		{
			System.out.println("You have passed with Distinction");
		}
		else 
			if (marks<75 && marks>=60)
			{
			System.out.println("You have passed with First Class");
			}
			else 
				if (marks <60 && marks>35)
				{
					System.out.println("You have passed with Second Class ");
				}
		
				else if (marks<35)
				{
					System.out.println("Sorry you have failed");
				}
		for (int X=7;X>=5;--X)
		{
			System.out.println("The value of x is " +X);
		}
		int M = 2;
		while(M>1)
		{
			System.out.println(M);
			M--;
		}
		int N=1;
		do
		{
			System.out.println(" Hello you are in a queue at no " +N);
					N--;
		}
		while( N>1);
	}
	
	
}
