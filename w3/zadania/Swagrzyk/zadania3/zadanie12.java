import java.util.*;
public class zadanie12 {



//    usuń z listy pierwszą pozycję(użyj metody remove())
//    wyświetl pozostałe elementy listy (użyj pętli for-each)
public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();
    lista.add("Magda");
    lista.add("Martyna");
    lista.add("Mateusz");
    lista.add("Maja");
    lista.add("Michal");
    lista.add("Mieczyslaw");
    lista.add("Mikolaj");
    lista.add("Milosz");
    lista.add("Mirek");
    lista.add("Marta");
    Collections.sort(lista);
    lista.remove(0); // usuwa element o indeksie 0
    for (String wyswietlanie : lista ) {
        System.out.println(wyswietlanie);
    }

}
}
