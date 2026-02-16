import java.util.Scanner;

public class l2q8 {

    static String check(int age) {
        if (age < 0) return "Invalid";
        if (age > 18) return "Adult";
        return "Minor";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) ages[i] = sc.nextInt();

        for (int i = 0; i < 10; i++)
            System.out.println(ages[i] + " -> " + check(ages[i]));
    }
}
