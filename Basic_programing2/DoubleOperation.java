import java.util.Scanner;
class DoubleOperation 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		double a=sc.nextDouble();
		System.out.println("enter b");
		double b=sc.nextDouble();
		System.out.println("enter c");
		double c=sc.nextDouble();
		double op1=a+b*c;
		double op2=a*b+c;
		double op3=c+a/b;
		double op4=a%b+c;
		System.out.println("result of op1 is:"+op1);
		System.out.println("result of op2 is:"+op2);
		System.out.println("result of op3 is:"+op3);
		System.out.println("result of op4 is:"+op4);
	}
}	