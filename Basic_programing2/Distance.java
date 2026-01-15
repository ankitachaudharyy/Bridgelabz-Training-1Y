import java.util.Scanner;
class Volume 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance in feet");
		double distance=sc.nextDouble();
		double yards=distance/3;
		
		System.out.println("distance in yards is:"+yards);
		double miles=distance/5280;
		
		System.out.println("distance in miles is:"+miles);
	}
}	