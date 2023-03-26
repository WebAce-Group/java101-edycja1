package zadania.Kasper123213;

import java.util.Scanner;
abstract class Spinner{
    public static String spinWords(String zdanie){
        String zdanieDoZwrotu="";
        String[] slowa = zdanie.split(" ");

        char[] c;
        String odwroconeSlowo;


        for(int i=0;;i++){
            if(slowa[i].length()>=5){
                c = slowa[i].toCharArray();
                odwroconeSlowo="";
                for(int j=c.length-1;j>=0;j--){
                    odwroconeSlowo+=c[j];
                }
                slowa[i]=odwroconeSlowo;
            }
            zdanieDoZwrotu+=slowa[i];
            if(i!= slowa.length-1) zdanieDoZwrotu+=" ";
            else break;
        }
        return zdanieDoZwrotu;
    }
}

public class ZadanieDodatkowe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj zdanie: ");

        String zdanie = sc.nextLine();

        System.out.println(Spinner.spinWords(zdanie));

    }
}