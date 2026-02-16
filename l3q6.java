import java.util.Scanner;

public class l3q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {

            boolean printed = false;
            for (int k = 0; k < i; k++) {
                if (text.charAt(i) == text.charAt(k)) {
                    printed = true;
                    break;
                }
            }

            if (!printed) {
                int count = 0;
                for (int j = 0; j < text.length(); j++)
                    if (text.charAt(j) == text.charAt(i)) count++;

                System.out.println(text.charAt(i) + " -> " + count);
            }
        }
    }
}
