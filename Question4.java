package assignment13;

public class Question4 {
    public void wrapperComparison(){
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b : " + (a == b));
        System.out.println("c == d : " + (c == d));
        System.out.println("a.equals(b) : " + a.equals(b));
    }

    public static void main(String[] args) {
        Question4 q = new Question4();
        q.wrapperComparison();
    }
}