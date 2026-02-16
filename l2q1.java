import java.util.Scanner;

public class l2q1 {

    static int myLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        System.out.println("User method = " + myLength(text));
        System.out.println("Built-in = " + text.length());
    }
}
