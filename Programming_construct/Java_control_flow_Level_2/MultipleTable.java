import java.util.Scanner;
class Multipletable
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int  a,b;
		a=input.nextInt();
		b=input.nextInt();
		for(;a<=b;a++)
		{
			for(int i=1;i<=10;i++)
			{
				int c= a * i;
				System.out.println( +a+ "*" +i+ "=" +c );
			}
		System.out.println();
		}
	}
}