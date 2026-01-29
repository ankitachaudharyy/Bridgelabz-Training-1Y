import java.util.Scanner;
class FourFizzBuzz
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a ;
		
		a=input.nextInt();
		
		for(int i=1;i<=a;i++)
		{
		if (i%4==0)
		{
			System.out.println("FizzBuzz");
		}
		else
		{
			System.out.println(i);
		}
			
			
		}
	}
}