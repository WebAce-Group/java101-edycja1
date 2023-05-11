public class Spinner {
    public static String SpinWords(String words){
        String[] wordsTab=words.split(" ");
        String finalSentence="" ,reversedWord;
        for (String x:wordsTab) {
            reversedWord="";
            if (x.length()>=5){
                for (int i=x.length()-1;i>=0;i--){
                    reversedWord+=x.charAt(i);
                }
            }else {
                reversedWord = x;
            }
            finalSentence+=reversedWord;
            finalSentence+=" ";
        }

        return finalSentence;

    }
    public static void main(String[] args){
        System.out.println(SpinWords("This is another test"));


    }
}
