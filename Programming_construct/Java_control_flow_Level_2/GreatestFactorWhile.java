import java.util.*;
class GreatestFactorWhile
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int a;
		System.out.print("Enter a number: ");
		a=input.nextInt();
		int gt=1;
		int i=a-1;
		while(i>=1)
		{
			i--;
			if(a%i==0)
			{
				gt=i;
				break;
			}
		}
		System.out.println("The greatest factor is: "+gt);
		
	}
}