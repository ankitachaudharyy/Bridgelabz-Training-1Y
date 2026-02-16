import java.util.Scanner;

public class l2q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;

        String user = text.substring(start, end + 1);
        String builtin = text.trim();

        System.out.println("Same = " + user.equals(builtin));
    }
}
