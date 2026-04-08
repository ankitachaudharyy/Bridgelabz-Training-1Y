package assignment13;

public class Question8 {
    public void countCharacters(String input){
        int letters = 0;
        int digits = 0;
        int specials = 0;

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
                letters++;
            } else if(ch >= '0' && ch <= '9'){
                digits++;
            } else if(ch == ' '){
            } else {
                specials++;
            }
        }

        System.out.println("Input String : " + input);
        System.out.println("Total Letters : " + letters);
        System.out.println("Total Digits : " + digits);
        System.out.println("Total Special Characters : " + specials);
    }

    public static void main(String[] args) {
        Question8 q = new Question8();
        q.countCharacters("Hello123@GLA!");
    }
}