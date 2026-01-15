import java.util.Scanner;
class Price
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter unit price");
		int price=sc.nextInt();	
		System.out.println("Enter quantity to be bought:");
		int quantity=sc.nextInt();
		int totalprice=price*quantity;
		
		System.out.println("The total purchase price is INR:"+totalprice);
		
		
	}
}	