import java.util.Scanner;

public class l1q7 {

    static void handle(String s) {
        try {
            int x = Integer.parseInt(s);
            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        handle(s);
    }
}
