import java.util.Scanner;

public class que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[11];
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            sum += height[i];
        }
        double mean = sum / 11;
        System.out.println("Mean height = " + mean);
    }
}
