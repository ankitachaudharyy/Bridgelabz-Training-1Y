import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        int [] ages = new int [10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            ages[i] = sc.nextInt();
        }

        for(int age : ages){
            if(age < 0){
                System.out.println("Invalid age");
            } else if (age >= 18) {
                System.out.println("Student with " + age + " can vote.");
            } else {
                System.out.println("Student with " + age + " cannot vote.");
            }
        }
    }
}
