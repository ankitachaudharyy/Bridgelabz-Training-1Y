import java.util.Scanner;

public class l2q4 {

    static int len(String s) {
        int i = 0;
        try { while (true) { s.charAt(i); i++; } }
        catch (Exception e) { return i; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.split(" ");

        String shortest = words[0];
        String longest = words[0];

        for (String w : words) {
            if (len(w) < len(shortest)) shortest = w;
            if (len(w) > len(longest)) longest = w;
        }

        System.out.println("Shortest = " + shortest);
        System.out.println("Longest = " + longest);
    }
}
