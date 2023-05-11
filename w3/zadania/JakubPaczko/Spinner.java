public class Spinner {
    public static void main(String[] args) {
        String text = "Hey fellow warriors";

        System.out.println(spinWords(text));
    }

    static String spinWords(String input) {

        String words[] = input.split(" ");


        for (int j = 0; j < words.length; j++) {

            if(words[j].length() >= 5){
                String result = "";
                for (int x = words[j].length()-1; x >= 0; x--) {
                    result += words[j].charAt(x);
                }
                words[j] = result;
            }

        }

        String finalResult = "";

        for (String word : words) {
            finalResult += word + " ";
        }
        return finalResult;
    }
}
