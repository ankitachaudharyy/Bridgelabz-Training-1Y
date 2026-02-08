import java.util.Scanner;
public class que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] multiplicationResult = new int[4];
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int k = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[k] = num * i;
            k++;
        }
        k = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + multiplicationResult[k]);
            k++;
        }
    }
}
