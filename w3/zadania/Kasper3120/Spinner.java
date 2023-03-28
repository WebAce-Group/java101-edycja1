public class Spinner {
    /**
     * Func reverses each word w >=5 letters 
     * **input** - String with only letters and spaces in between words
     */
    public String spinWords(String input) {
        String output = "";
        String[] words = input.split(" ");
        for (String word : words) {
            if (word.length() >= 5) {
                String[] letters = word.split("");
                for (int i = letters.length-1; i >= 0; i--) {
                    output += letters[i];
                }
            } else {
                output += word; 
            }
            output += " ";
        }
        output.replaceAll(" \b", "");
        return output;
    }
}
