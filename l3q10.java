import java.util.*;

public class l3q10 {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    public static void main(String[] args) {
        List<String> deck = new ArrayList<>();

        // Create deck
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        System.out.println("Total cards: " + deck.size());

        // Shuffle deck
        Collections.shuffle(deck);

        // Distribute cards
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        int cardsPerPlayer = deck.size() / players;
        int index = 0;

        for (int p = 1; p <= players; p++) {
            System.out.println("\nPlayer " + p + " cards:");
            for (int c = 0; c < cardsPerPlayer; c++) {
                System.out.println(deck.get(index++));
            }
        }
    }
}
