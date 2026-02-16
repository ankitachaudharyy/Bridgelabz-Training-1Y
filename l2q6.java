import java.util.Scanner;

public class l2q6 {

    static String type(char c) {
        if (!Character.isLetter(c)) return "Not Letter";
        c = Character.toLowerCase(c);
        if ("aeiou".indexOf(c) != -1) return "Vowel";
        return "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + " -> " + type(text.charAt(i)));
        }

    }
}
