import java.util.Scanner;
import java.util.Arrays;

public class l2que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int maxDigit = 2;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                digits = Arrays.copyOf(digits, maxDigit);
            }

            digits[index] = num % 10;
            num /= 10;
            index++;
        }

        System.out.println("Digits:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}
