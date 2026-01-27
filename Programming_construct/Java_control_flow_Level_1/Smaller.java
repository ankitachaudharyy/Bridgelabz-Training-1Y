import java.util.Scanner;
class Smaller
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1");
		int a=sc.nextInt();
		System.out.println("Enter number2");
		int b=sc.nextInt();
		System.out.println("Enter number3");
		int c=sc.nextInt();
		if(a<b && a<c)
		{
			System.out.println("a is smallest");
		}
		else if(b<a && b<c)
		{
			System.out.println("b is smallest");
		}
		else
		{
			System.out.println("c is smallest");
		}
	}
}	
		