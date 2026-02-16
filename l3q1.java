import java.util.Scanner;

public class l3q1 {

    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3]; // weight, height(m), bmi
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            data[i][0] = sc.nextDouble();          // weight
            data[i][1] = sc.nextDouble() / 100.0; // cm -> meter

            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);
            status[i] = getStatus(data[i][2]);
        }

        System.out.println("Wt  Ht  BMI  Status");
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + " " +
                               data[i][1] + " " +
                               data[i][2] + " " +
                               status[i]);
        }
    }
}
