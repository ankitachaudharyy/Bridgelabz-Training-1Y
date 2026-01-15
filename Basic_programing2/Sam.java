import java.util.Scanner;
class Sam
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Maths marks");
		int math=96;
		System.out.println("Physics marks");
		int physics=95;
		System.out.println("Chemistry marks");
		int chemistry=96;
		
		int average=(math+physics+chemistry)/3;
		System.out.println("Average is:"+average);
	}
}