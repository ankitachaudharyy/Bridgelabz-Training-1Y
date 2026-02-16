import java.util.Random;
import java.util.Scanner;

public class l2q10 {

    static char grade(double p) {
        if (p >= 80) return 'A';
        if (p >= 70) return 'B';
        if (p >= 60) return 'C';
        if (p >= 50) return 'D';
        if (p >= 40) return 'E';
        return 'R';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int total = r.nextInt(101) + r.nextInt(101) + r.nextInt(101);
            double percent = total / 3.0;

            System.out.println("Percent = " + percent +
                               " Grade = " + grade(percent));
        }
    }
}
