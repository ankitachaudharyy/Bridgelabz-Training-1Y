import java.util.Scanner;

public class l2q2 {

    static String[] mySplit(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ' ') count++;

        String[] words = new String[count];
        int index = 0;
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words[index++] = temp;
                temp = "";
            } else {
                temp += s.charAt(i);
            }
        }
        words[index] = temp;
        return words;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] a = mySplit(text);
        String[] b = text.split(" ");

        System.out.println("Same = " + compare(a, b));
    }
}
