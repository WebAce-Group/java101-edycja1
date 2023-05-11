public class Spinner {
    public static String SpinWords(String words) {
        String result = "";

        if (words.contains(" ")) {
            String[] wordsArray = words.split(" ");
            for (String x : wordsArray) {
                if (x.length() > 4) {
                    result += reversveAString(x);
                }
                else {
                    result += x;
                }
                result += " ";
            }
        }
        else {
            if (words.length() > 5) {
                result += reversveAString(words);
            }
            else {
                result += words;
            }
        }

        return result;
    }

    private static String reversveAString(String str) {
        String result = "";
        char[] wordCharArray = str.toCharArray();
        for (int i = wordCharArray.length - 1; i >= 0; i--) {
            result += wordCharArray[i];
        }

        return result;
    }
}
