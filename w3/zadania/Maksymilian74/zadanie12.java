package w3.zadania.Maksymilian74;
import java.util.ArrayList;
import java.util.Collections;

public class zadanie12 {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();
                lista.add("Jakub");
                lista.add("Maciej");
                lista.add("Tomasz");
                lista.add("Grzegorz");
                lista.add("Krzysztof");
                lista.add("Piotr");
                lista.add("Paweł");
                lista.add("Kamil");
                lista.add("Marcin");
                lista.add("Maksymilian");

        Collections.sort(lista);

        System.out.println("Wyświetlenie przed usunięciem: ");
                for(String imie : lista)
                    System.out.println(imie);
                lista.remove(0);
        System.out.println();
        System.out.println("Wyświetlenie po usunięcu: ");
        for(String imie : lista)
            System.out.println(imie);
    }
}
