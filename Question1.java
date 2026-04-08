package assignment13;

import java.util.Scanner;

public class Question1 {
    public void primitiveToWrapper() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = input.nextInt();
        Integer number2 = number1;
        System.out.println("Primitive:-" +number1);
        System.out.println("Wrapper:-" +number2);
    }
    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.primitiveToWrapper();

    }
}
