import java.util.Scanner;

public class l3q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[][] freq = new int[256][2];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)][0] = text.charAt(i);
            freq[text.charAt(i)][1]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i][1] > 0) {
                System.out.println((char) freq[i][0] + " -> " + freq[i][1]);
            }
        }
    }
}
