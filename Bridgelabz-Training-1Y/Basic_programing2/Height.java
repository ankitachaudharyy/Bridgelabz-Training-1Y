import java.util.Scanner;
class Volume 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height in cm");
		int height=sc.nextInt();
		double inch=height/2.54;
		double feet=height/30.48;
		
		System.out.println("your height in cm is:"+height);
		System.out.println("your height in inches is:"+inch);
		
		System.out.println("your height in feet is:"+feet);
	}
}	