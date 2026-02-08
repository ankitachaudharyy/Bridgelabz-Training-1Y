import java.util.Scanner;

public class l2que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = new int[10];
        int index = 0;

        while (num > 0) {
            digits[index] = num % 10;
            num /= 10;
            index++;
        }

        System.out.println("Reverse order:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
    }
}
