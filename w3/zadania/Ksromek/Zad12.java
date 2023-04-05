package w3.zadania.Ksromek;
import java.util.ArrayList;
import java.util.Collections;
public class Zad12
{
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<String>();
        List.add("Kamil");
        List.add("Kacper");
        List.add("Andrzej");
        List.add("Zenon");
        List.add("Mateusz");
        List.add("Leon");
        List.add("Konrad");
        List.add("Michał");
        List.add("Artur");
        List.add("Grzegorz");
        Collections.sort(List);
        List.remove(0);
        for (String i : List)

            System.out.println(i);

    }
}
