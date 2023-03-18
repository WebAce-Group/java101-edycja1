import java.util.ArrayList;
import java.util.Collections;

public class Zadanie12 {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();
        //Zakladamy ze podal 10 imion
        lista.add("Patryk");
        lista.add("Aneta");
        lista.add("Darek");
        lista.add("Mariusz");
        lista.add("Paulina");
        lista.add("Kondrad");
        lista.add("Maja");
        lista.add("Genowefa");
        lista.add("Arkadiusz");
        lista.add("Jasiek");

        Collections.sort(lista);
        lista.remove(0);
        for(String element : lista){
            System.out.print(element+", ");
        }

    }
}
