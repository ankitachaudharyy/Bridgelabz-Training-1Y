import java.util.Scanner;
class Harry
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter birth year");
	int birthYear=2000;
	System.out.println("Current year");
	int currentYear=2026;
	System.out.println("Age of harry");
	int age=currentYear-birthYear;
	System.out.println("Age of Harry is:"+age);
}
} 