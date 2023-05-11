package w3.zadania.Tomoo3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Zadanie12 {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Adam");
        lista.add("Piotrek");
        lista.add("Marta");
        lista.add("Daniel");
        lista.add("Kuba");
        lista.add("Dawid");
        lista.add("Wiktor");
        lista.add("Rysiu");
        lista.add("Norbert");
        lista.add("Dominik");
        Collections.sort(lista);
        lista.remove(0);

        for(String el : lista){
            System.out.println(el);
        }
    }
}
