import java.util.Scanner;
class Volume 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("radius of earth");
		double rKm=6378;
		double pi=3.14;
		double volume=(4/3)*pi*Math.pow(rKm,3);
		System.out.println("volume of earth in cubic km is:"+volume);
		double rMiles=rKm*0.621;
		double volume2=(4/3)*pi*Math.pow(rMiles,3);
		System.out.println("volume of earth in cubic miles is:"+volume2);
	}
}	