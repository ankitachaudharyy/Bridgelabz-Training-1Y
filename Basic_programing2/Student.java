import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Pens");
		int pens=14;
		System.out.println("Students");
		int students=3;
		double que=pens/students;
		System.out.println("que is:"+que);
		double remainder=pens%students;
		System.out.println("remainder is:"+remainder);
	}
}