package assignment13;

public class Question6 {
    public static int safeParseInt(String input){
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(!Character.isDigit(ch)){
                return -1; // invalid input
            }
        }
        int num = 0;
        for(int i = 0; i < input.length(); i++){
            num = num * 10 + (input.charAt(i) - '0');
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Input '123' : " + safeParseInt("123"));
        System.out.println("Input 'abc' : " + safeParseInt("abc"));
        System.out.println("Input '45.6' : " + safeParseInt("45.6"));
        System.out.println("Input '0' : " + safeParseInt("0"));
    }
}