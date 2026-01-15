import java.util.Scanner;
class Perimeter 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter perimeter");
		int perimeter=sc.nextInt();
		int length=perimeter/4;
		System.out.println("The length of the side is:"+length);

	}
}	