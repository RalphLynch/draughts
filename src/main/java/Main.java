import java.util.Random;

class Main {
    public static void main(String[] args) {
        String[][] deck = new String[4][13];
        String suit = "";
        String card = "";

        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck[0].length; j++) {
                switch (i) {
                    case 0: suit = "Spades";
                        break;
                    case 1: suit = "Clubs";
                        break;
                    case 2: suit = "Hearts";
                        break;
                    case 3: suit = "Diamonds";
                }

                switch (j) {
                    case 0: card = "Ace";
                        break;
                    case 10: card = "Jack";
                        break;
                    case 11: card = "Queen";
                        break;
                    case 12: card = "King";
                        break;
                    default: card = Integer.toString(j + 1);
                }

                deck[i][j] = card + " of " + suit;

                System.out.println(deck[i][j]);
            }
        }

        String[] hand = new String[5];
        Random rand = new Random();

        System.out.println("\nYour hand is:");

        for (int k = 0; k < 5; k++) {
            hand[k] = deck[rand.nextInt(4)][rand.nextInt(13)];
            System.out.println(hand[k]);
        }
    }
}
