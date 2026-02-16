import java.util.Scanner;

public class l2q3 {

    static int len(String s) {
        int i = 0;
        try {
            while (true) { s.charAt(i); i++; }
        } catch (Exception e) { return i; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.split(" ");
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len(words[i]));
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(result[i][0] + " -> " + result[i][1]);
        }
    }
}
