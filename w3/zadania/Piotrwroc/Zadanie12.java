import java.util.*;
public class Zadanie12 {
    public static void main(String[] args)
    {
        List<String> lista = new ArrayList<>();
        lista.add("Baldwin");
        lista.add("Wilhelm");
        lista.add("Ryszard");
        lista.add("Filip");
        lista.add("Saladyn");
        lista.add("Fryderyk");
        lista.add("Gotfryd");
        lista.add("Reginald");
        lista.add("Ludwik");
        lista.add("Konrad");
        Collections.sort(lista);
        lista.remove(0);
        for (String x : lista)
        {
            System.out.println(x);
        }
    }
}