import java.util.Scanner;

public class cleanInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        System.out.println(clean(input));
    }
    public static String clean(String str){
        String pattern = "[^a-zA-Z0-9\\s]";
        return str.replaceAll(pattern,"");
    }
}
