import java.util.ArrayList;
import java.util.Scanner;

public class ZadanieDodatkowe
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zdanie do obrócenia: ");
        String sentence = scanner.nextLine();
        System.out.println("Twoje obróceone słowo brzmi: "+ spinWords(sentence.trim()));
    }
    public static String spinWords(String givenWords)
    {
        String spinnedWords = "";
        String wordTab[] = givenWords.split(" ");
        for (String oneWord: wordTab)
        {
            if (oneWord.length()<5)
            {
                spinnedWords+=" ";
                spinnedWords+=oneWord;
            }
            else
            {
                int lenght = oneWord.length();
                spinnedWords += " ";
                for (int i=lenght-1;i>=0;i--)
                {
                    spinnedWords += oneWord.charAt(i);
                }
            }
        }
        return spinnedWords.trim();
    }
}