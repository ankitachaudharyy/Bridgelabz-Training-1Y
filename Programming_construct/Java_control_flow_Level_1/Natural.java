import java.util.*;
class Natural
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number1");
		int n=sc.nextInt();
		if(n>=0)
		{
			System.out.println(" number is natural number");
		
			int positive=n*(n+1)/2;
			System.out.println("sum of n natural number is:"+positive);
		}
		else
		{
			System.out.println("number is not a natural number");
		}
	}
}
			
			