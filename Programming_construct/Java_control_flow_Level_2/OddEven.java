import java.util.Scanner;
class OddEven
{
    public static void main(String[] args)
	{
        Scanner input=new Scanner(System.in);
        System.out.println("enter your number ");
        int a=input.nextInt();
        if (a>0)
		{
            System.out.println("your number is natural number\n");
                System.out.print("odd number form 1 to "+a +" are: ");
                for (int i = 1; i <= a; i++) {
                     if(i%2 != 0)
                     {
                    System.err.print(i + " ");
                     }
                }
                System.out.print("\n even number from 1 to "+a +" are: ");
                     for (int i = 1; i <= a; i++)
					 {
                     if (i%2 ==0)
					 {
                        System.out.print(i +" ");
                    }
                    
                }
            }
        }  
    
    }