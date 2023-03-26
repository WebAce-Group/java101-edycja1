public class ZadanieDodatkowe
{
    /*
     * @brief The method spinWords make rversed all words in sentence, wich lenght is
     *        is longer than 5 letters.
     * 
     * @param Method takes only one string argument, wich is sentence.
     * 
     * @return The "spinned" string sentence.
     */
    private static String spinWords(final String sentence)
    {
        final String[] words = sentence.split(" ");
        String[] letters;
        String spinnedWord;
        String spinnedSentence = "";

        for (String word : words) 
        {
            spinnedWord = "";

            if (word.length() >= 5)
            {
                letters = word.split("");
                
                for (int i = letters.length - 1; i >= 0; i--)
                {
                    spinnedWord += letters[i];
                }
            }
            else
            {
                spinnedWord = word;
            }

            spinnedSentence += spinnedWord + " ";
        }
        return spinnedSentence;
    }
    public static void main(String[] args)
    {
        System.out.println(spinWords("Ala ma kota, kot ma Alę"));
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test"));
        System.out.println(spinWords("This is another test"));

        for (String string : args) 
        {
            System.out.println(spinWords(string));
        }
    }
}