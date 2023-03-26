public class ZadanieDodatkowe
{
    public static void main(String[] args)
    {
        final String a = "abba,b,c";
        String[] abc = a.split(",");
        String[] abcd;
        for (String string : abc) {
            abcd = string.split("");
            for (String string2 : abcd) {
                System.out.println(string2);
            }
        }


    }
}