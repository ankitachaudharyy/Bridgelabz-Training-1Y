import java.util.*;
class SpringSeason
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month");
		int month=sc.nextInt();
		System.out.println("Enter day");
		int day=sc.nextInt();
		if (month==3 && day>=20 || month==4 || month==5 || month==6 && day<=20)
		{
		System.out.println("Its a spring season");
		}else
		{
		System.out.println("Not aspring season");
		}
	}
}	