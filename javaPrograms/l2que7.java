import java.util.Scanner;

public class l2que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of persons: ");
        int n = sc.nextInt();

        double[][] person = new double[n][3]; // weight, height, bmi
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Weight: ");
            person[i][0] = sc.nextDouble();

            System.out.print("Height: ");
            person[i][1] = sc.nextDouble();

            person[i][2] = person[i][0] / (person[i][1] * person[i][1]);

            if (person[i][2] < 18.5) status[i] = "Underweight";
            else if (person[i][2] < 25) status[i] = "Normal";
            else if (person[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) +
                    " BMI = " + person[i][2] +
                    " Status = " + status[i]);
        }
    }
}

