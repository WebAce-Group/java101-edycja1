import java.util.ArrayList;
import java.util.Collections;
public class Zadanie_12 {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Mateusz");
        lista.add("Wojtek");
        lista.add("Lukasz");
        lista.add("Julka");
        lista.add("Kornelia");
        lista.add("Konrad");
        lista.add("Szymon");
        lista.add("Klaudia");
        lista.add("Andrzej");
        lista.add("Korneliusz");
        System.out.println("Rozmiar listy to: "+lista.size());
        Collections.sort(lista);
        lista.remove(0);
        for (String element : lista) {
            System.out.println(element);
        }
    }
}
