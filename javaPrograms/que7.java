import java.util.Scanner;

public class que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int size = sc.nextInt();
        int[] even = new int[size];
        int[] odd = new int[size];
        int e = 0, o = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even[e] = num;
                e++;
            } else {
                odd[o] = num;
                o++;
            }
        }
        System.out.println("Even numbers:");
        for (int i = 0; i < e; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < o; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}

