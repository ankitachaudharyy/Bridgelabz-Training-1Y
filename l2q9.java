import java.util.Random;
import java.util.Scanner;

public class l2q9 {

    static String[] items = {"rock", "paper", "scissors"};

    static int winner(String u, String c) {
        if (u.equals(c)) return 0;
        if ((u.equals("rock") && c.equals("scissors")) ||
            (u.equals("paper") && c.equals("rock")) ||
            (u.equals("scissors") && c.equals("paper")))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int games = sc.nextInt();
        int user = 0, comp = 0;

        for (int i = 0; i < games; i++) {
            String u = sc.next();
            String c = items[r.nextInt(3)];

            int w = winner(u, c);
            if (w == 1) user++;
            else if (w == -1) comp++;
        }

        System.out.println("User wins = " + user);
        System.out.println("Computer wins = " + comp);
    }
}
