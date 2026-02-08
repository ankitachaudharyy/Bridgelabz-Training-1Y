import java.util.Scanner;

public class l2que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("Years of service: ");
            int years = sc.nextInt();
            System.out.print("Old salary: ");
            double oldSalary = sc.nextDouble();
            double bonus;
            if (years > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }
            double newSalary = oldSalary + bonus;
            totalBonus += bonus;
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            System.out.println("Bonus = " + bonus);
            System.out.println("New salary = " + newSalary);
            System.out.println();
        }
        System.out.println("Total bonus = " + totalBonus);
        System.out.println("Total old salary = " + totalOldSalary);
        System.out.println("Total new salary = " + totalNewSalary);
    }
}
