import java.util.Scanner;
class Volume 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int base=sc.nextInt();
		
		
		System.out.println("Enter height");
		int height=sc.nextInt();
		double area_of_tri=0.5*base*height;
		System.out.println("Area of triangle in square centimeters is:"+area_of_tri);
		double area=(area_of_tri)/(2.54*2.54);
		System.out.println("Area of triangle in square inches is:"+area);
		
	}
}	