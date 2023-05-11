import java.util.ArrayList;
import java.util.Collections;

public class Zadanie12 {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Kuba");
        lista.add("Piotr");
        lista.add("Karolina");
        lista.add("Mateusz");
        lista.add("Kamil");
        lista.add("Ola");
        lista.add("Gosia");
        lista.add("Emilia");
        lista.add("Szymon");
        lista.add("Kamila");
        Collections.sort(lista);
        lista.remove(0);
        for (String imie:lista) {
            System.out.println(imie);
        }
    }
}
