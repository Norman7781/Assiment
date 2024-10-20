/*
Aung Kaung Myat
6611201
541
 */
import java.util.Random;
import java.util.Scanner;

public class CardGuessingGame {
    private static final String[] SUITS = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private static final String[] RANKS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    private static Card drawRandomCard() {
        String suit = SUITS[RANDOM.nextInt(SUITS.length)];
        String rank = RANKS[RANDOM.nextInt(RANKS.length)];
        return new Card(suit, rank);
    }

    public static void main(String[] args) {
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        while (true) {
            Card chosenCard = drawRandomCard();
            boolean guessedCorrectly = false;
            int attempts = 5;

            while (attempts > 0 && !guessedCorrectly) {
                System.out.println("\nPlease select the rank of the card.");
                System.out.println("(1=Ace, 2=Two,…, 10=Ten, 11=Jack, 12=Queen, 13=King): ");
                int rankChoice = SCANNER.nextInt();

                System.out.println("Please select the suit.");
                System.out.println("(1=Spades, 2=Hearts, 3=Diamonds, 4=Clubs): ");
                int suitChoice = SCANNER.nextInt();

                String chosenRank = RANKS[rankChoice - 1];
                String chosenSuit = SUITS[suitChoice - 1];

                if (chosenCard.getRank().equals(chosenRank) && chosenCard.getSuit().equals(chosenSuit)) {
                    System.out.println("You won!! You picked the right card.");
                    guessedCorrectly = true;
                    wins++;
                } else if (chosenCard.getRank().equals(chosenRank)) {
                    System.out.println("Wrong suit, correct rank!! Pick again.");
                } else if (chosenCard.getSuit().equals(chosenSuit)) {
                    System.out.println("Right suit, wrong rank!! Pick again.");
                } else {
                    System.out.println("Wrong suit, wrong rank!! Pick again.");
                }

                attempts--;

                if (attempts == 0 && !guessedCorrectly) {
                    System.out.println("You've run out of tries. You lost!! I chose " + chosenCard.getRank() + " of " + chosenCard.getSuit() + ".");
                    losses++;
                }
            }

            gamesPlayed++;
            System.out.println("Do you want to play again [Y/N]?");
            char playAgain = SCANNER.next().charAt(0);
            if (playAgain == 'N' || playAgain == 'n') {
                break;
            }
        }

        System.out.println("\nSummary of all games played:");
        System.out.println("Total games played: " + gamesPlayed);
        System.out.println("Win : " + wins + " (" + (wins * 100 / gamesPlayed) + "%)");
        System.out.println("Loss: " + losses + " (" + (losses * 100 / gamesPlayed) + "%)");
    }
}
