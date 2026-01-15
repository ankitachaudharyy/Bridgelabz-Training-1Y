import java.util.Scanner;
class Profit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Cost price");
		int costprice=129;
		System.out.println("Selling price");
		int sellingprice		=191;

		int profit=sellingprice-costprice;
		System.out.println("Profit is:"+profit);
	}
}	