import java.util.Scanner;

public class l3q7 {

    static boolean method1(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    static boolean method2(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return method2(s, start + 1, end - 1);
    }

    static boolean method3(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("M1 = " + method1(text));
        System.out.println("M2 = " + method2(text, 0, text.length() - 1));
        System.out.println("M3 = " + method3(text));
    }
}
