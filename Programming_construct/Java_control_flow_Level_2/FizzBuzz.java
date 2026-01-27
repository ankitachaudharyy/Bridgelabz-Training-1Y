import java.util.Scanner;
class FizzBuzz
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a ;
		
		a=input.nextInt();
		
		for(int i=1;i<=a;i++)
		{
		if (i%3==0 && i%5==0)
		{
			System.out.println("Fizzbuzz");
		}
		else if (i%3==0)
		{
			System.out.println("Fizz");
		}
		else if (i%5==0)
		{
			System.out.println("Buzz");
		}
		else
		{	
			System.out.println(i);
		}
			
			
		}
	}
}