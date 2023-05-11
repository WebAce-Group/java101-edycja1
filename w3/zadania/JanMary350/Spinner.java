public class Spinner {
    static String SpinWords(String phrase){
        char[] word = phrase.toCharArray();
        char[] newPhrase = new char[word.length];
        int j;
        for(int i = 0; i< word.length; i++) {
            j = 0;
            while (word[i + j] != ' ' && i+j+1 < word.length) {
                if (i + j + 1 < word.length) {
                    j++;
                }
            }
            if (j >= 5) {
                for (int k = j; k > 0; k--) {
                    newPhrase[i - k + j] = word[i + k-1];
                }
                newPhrase[i+j] = (char) 32;
            } else {
                for (int k = 0; k<=j; k++) {
                    newPhrase[i + k] = word[i + k];
                }
            }
            i += j;
        }
        String newStringPhrase = String.valueOf(newPhrase);
        return newStringPhrase;
    }

    public static void main(String[] args){
        System.out.println(SpinWords("This is another test"));
    }
}
