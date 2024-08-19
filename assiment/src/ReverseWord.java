/*
Aung Kaung Myat
6611201
541
 */
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = reader.nextLine();

        String[] arry = input.split(" ");
        for(int i=0; i<arry.length;i++){
            System.out.println(reverse(arry[i]));
        }


    }

    public static String reverse(String word) {
        String mine = "";
         for (int j=0; j < word.length(); j++) {
             if(word.charAt(j)=='?' || word.charAt(j)=='!' || word.charAt(j)=='#' || word.charAt(j)=='$' || word.charAt(j)=='%' || word.charAt(j)=='&'  || word.charAt(j)=='*'){
                 mine=mine;
             }else{
                 mine = word.charAt(j) + mine;
             }

         }
        return mine.toUpperCase();
    }
}
