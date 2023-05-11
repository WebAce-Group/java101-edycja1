package w3.zadania.Nurek54;
public class Spinner {

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() >= 5) {
                sb.append(new StringBuilder(word).reverse().toString());
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String zdanie1 = "Hey fellow warriors";
        String zdanie2 = "This is a test";
        String zdanie3 = "This is another test";

        System.out.println(spinWords(zdanie1));
        System.out.println(spinWords(zdanie2));
        System.out.println(spinWords(zdanie3));
    }
}
