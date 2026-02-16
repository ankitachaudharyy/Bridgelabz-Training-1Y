import java.util.Scanner;

public class l3q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String unique = "";

        for (int i = 0; i < text.length(); i++)
            if (unique.indexOf(text.charAt(i)) == -1)
                unique += text.charAt(i);

        for (int i = 0; i < unique.length(); i++) {
            char c = unique.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++)
                if (text.charAt(j) == c) count++;

            System.out.println(c + " -> " + count);
        }
    }
}
