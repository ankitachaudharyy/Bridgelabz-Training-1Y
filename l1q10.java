import java.util.Scanner;

public class l1q10 {

    static String myLower(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
            res += c;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String a = myLower(text);
        String b = text.toLowerCase();

        System.out.println("Same = " + a.equals(b));
    }
}
