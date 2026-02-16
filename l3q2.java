import java.util.Scanner;

public class l3q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String unique = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (unique.indexOf(c) == -1) {
                unique += c;
            }
        }

        System.out.println("Unique = " + unique);
    }
}
