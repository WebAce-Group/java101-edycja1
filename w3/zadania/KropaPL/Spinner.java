import java.util.Scanner;

public class Spinner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyrazy");
        String wyrazy = scan.nextLine();
        System.out.println(spinWords(wyrazy));

    }
    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() >= 5) {
                result.append(new StringBuilder(word).reverse());
            } else {
                result.append(word);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }


}