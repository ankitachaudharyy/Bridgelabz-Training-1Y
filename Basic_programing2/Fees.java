import java.util.Scanner;
class Fees
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("fees is");
		int fees=125000;
		System.out.println("discount percent is");
		double discountPercent=10;
		double discount=(discountPercent/100)*fees;
		System.out.println("The discount amount is INR:"+discount);
		double finalfees=fees-discount;
		System.out.println("final discounted fees is INR:"+finalfees);
	}
}	
