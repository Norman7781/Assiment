import java.util.Scanner;
public class h {
    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Enter a word: ");
            String text = reader.nextLine();

            System.out.println("Enter a position to remove: ");
            int num = reader.nextInt();

            if (num < 0 || num >= text.length()) {
                System.out.println("Invalid position");
            } else {
                String result = removeCharacter(text, num);
                System.out.println(result);
            }

            reader.close();
        }
        public static String removeCharacter(String str, int n) {
            // Check if the position is valid
            if (n < 0 || n >= str.length()) {
                throw new IllegalArgumentException("Position out of bounds");
            }

            // Remove the character at the specified position
            return str.substring(0, n) + str.substring(n + 1);
        }
    }


