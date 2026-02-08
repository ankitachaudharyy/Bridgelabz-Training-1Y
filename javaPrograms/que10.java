public class Main {
    public static void que10(String[] args) {
        String[] result = new String[100];
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Position " + (i + 1) + " : " + result[i]);
        }
    }
}

