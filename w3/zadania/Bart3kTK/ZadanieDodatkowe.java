
public class ZadanieDodatkowe {


    static String Spinner(String zdanie){
        zdanie += " ";
        char[] literki = zdanie.toCharArray();
        int startId = 0; int endId = 0; int dlugosc = 0;
        for (int i = 0; i<literki.length; i++){
            endId = i;
            if (literki[i] == ' '){
                if (dlugosc>= 5)
                   literki = SpinnerHelpRev(literki, startId, endId-1);
                dlugosc = 0;
                startId = i+1;
                continue;
            }
            dlugosc ++;
        }

        zdanie = "";
        for (char i: literki)
            zdanie += String.valueOf(i);
        return zdanie;
    }
    /* Odwracanie danego odcinka tablicy char */
    static char[] SpinnerHelpRev(char[] literki, int start, int end){
        int zmiany = ((end-start) / 2);                                     // Ilosc zmian do przeprowadzenia
        for (int i = 0; i<zmiany; i++){
            char pomoc = literki[start + i];                                //
            literki[start + i] = literki[end-i];                            //Podmienianie pierwszej z ostatnia itd...
            literki[end - i] = pomoc;                                       //
        }
        return literki;
    }
    public static void main(String[] args) {
        String slowa = "Wybuchowe kotki oraz odjechane jednorozce";
        System.out.println(slowa);
        System.out.println(Spinner(slowa));
    
    }

        
        
        
}
