package assignment13;

public class Question5 {
    public void wrapperBasics(){
        Integer num = 10;
        Character ch = 'a';

        System.out.println("Integer value : " + num);
        System.out.println("Character value : " + ch);

        System.out.println("Binary of 10 : " + Integer.toBinaryString(num));
        System.out.println("Is '5' a digit? : " + Character.isDigit('5'));
        System.out.println("Uppercase of 'a' : " + Character.toUpperCase(ch));
    }

    public static void main(String[] args) {
        Question5 q = new Question5();
        q.wrapperBasics();
    }
}