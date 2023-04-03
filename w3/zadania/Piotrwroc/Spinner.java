import java.util.*;
public class Spinner {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje zdanie");
        String zdanie=scanner.nextLine();
        System.out.println(SpinWords(zdanie));
        System.out.println(SpinWords( "This is test" ));
        System.out.println(SpinWords( "This is another test"));
    }
    public static String SpinWords(String zdanie)
    {
        String zmiana,gotowe="";
        String[] slowa = zdanie.split(" ");
        for (String x : slowa)
        {
            zmiana="";
            if (x.length()>=5)
            {
                for (int i=x.length()-1;i>=0;i--)
                {
                    zmiana+=x.charAt(i);
                }
            }
            else
            {
                zmiana=x;
            }
            gotowe+=zmiana+" ";
        }
        return gotowe;
    }
}
