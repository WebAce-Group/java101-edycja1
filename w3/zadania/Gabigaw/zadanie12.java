package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class zadanie12 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Adrianna"); //1
        lista.add("Kacper");//2
        lista.add("Michał");//3
        lista.add("Zosia");//4
        lista.add("Mateusz");//5
        lista.add("Karolina");//6
        lista.add("Julia");//7
        lista.add("Wojtek");//8
        lista.add("Paulina");//9
        lista.add("Adrian");//10
        System.out.println("aktualna lista imion: ");
        System.out.print(lista);
        System.out.println(" ");
        System.out.println(" ");

        Collections.sort(lista);
        System.out.println("posortowana lista imion: ");
        System.out.print(lista);
        System.out.println(" ");
        System.out.println(" ");

        lista.remove(0);
        System.out.println("lista imion bez pierwszego elementu (wyświetlane z for:each): ");
        for (String z : lista) {
            System.out.print(z + "  ");
        }
    }
}