import java.util.Scanner;
import java.util.ArrayList;
public class Spinner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg");
        String ciag = scanner.nextLine();

        System.out.println( SpinWords(ciag) );

        System.out.println(SpinWords( "Hey fellow warriors" ));
        System.out.println(SpinWords( "This is a test") );
        System.out.println(SpinWords( "This is another test" ));

    }

    public static String SpinWords( String ciag ){
        ArrayList<String> wyrazy = new ArrayList<String>();

        int k =0;

        for (int i = 0; i < ciag.length(); i++) {
            if ( ciag.charAt(i) == ' ') {
                wyrazy.add( ciag.substring(k,i) );
                k = i+1;
            }

            if (i == (ciag.length()-1) ) wyrazy.add(ciag.substring(k, i + 1));
        }

        String wynik = "";

        for (String wyraz : wyrazy) {

            if( wyraz.length() > 4) wynik += Odwroc(wyraz)+ " ";
            else wynik += wyraz + " ";

        }


        return wynik;
    }

    public static String Odwroc( String s1 ){
        String s2 = "";

        for (int i = ( s1.length() -1 ); i >= 0; i--) {
            s2 += s1.charAt(i);
        }

        return s2;
    }
}
