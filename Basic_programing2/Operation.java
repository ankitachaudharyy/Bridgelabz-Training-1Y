import java.util.Scanner;
class Operation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numb 1");
		int numb1=sc.nextInt();
		System.out.println("Enter numb 2");
		int numb2=sc.nextInt();
		double quotient=numb1/numb2;
		double remainder=numb1%numb2;		
		System.out.println("The quotient is:"+quotient);
		System.out.println("The remainder is:"+remainder);
	
	}
}	