import java.util.*;
class Friend
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.print("enter the age and height Amar: ");
		a=input.nextInt();
		System.out.print("enter the age and  height Anthony : ");
		b=input.nextInt();
		System.out.print("enter the age and height Akbar: ");
		int c=input.nextInt();
		if (a<b && a<c)
		{
			System.out.println("Amar is youngest: " +a);
		}
		else if (b<a && b<c)
		{
			System.out.println("Anthony is youngest: " +b);
		}
		else if(c<a && c<b)
		{
			System.out.println("Akbar is youngest: " +c);
		}
		System.out.println("enter the height Amar: ");
		int p=input.nextInt();
		System.out.println("enter the height Anthony : ");
		int q=input.nextInt();
		System.out.println("enter the height Akbar: ");
		int r=input.nextInt();
		if(p>q && p>r)
		{
			System.out.print("Amar is tallest");
		}
		if(q>p && q>r)
		{
			System.out.print("Anthony is tallest");
		}
		if(r>q && r>p)
		{
			System.out.print("Akbar is tallest");
		}
	}
}