package w3.zadania.JBar02;

import java.util.ArrayList;
import java.util.Collections;

public class Zadanie12 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Jan");
        lista.add("Eryk");
        lista.add("Tomek");
        lista.add("Kasia");
        lista.add("Asia");
        lista.add("Basia");
        lista.add("Gosia");
        lista.add("Tosia");
        lista.add("Janka");
        lista.add("Roman");

        Collections.sort(lista);//sortowanie alfabetycznie
        lista.remove(0 );
//petla for each
        for( String item  : lista){
            System.out.println(item);//iteruje po Stringu item
        }
    }
}