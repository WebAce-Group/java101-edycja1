import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Zadanie12 {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Jan1");
        lista.add("Jan2");
        lista.add("Jan3");
        lista.add("Jan4");
        lista.add("Jan5");
        lista.add("Jan6");
        lista.add("Jan7");
        lista.add("Jan8");
        lista.add("Jan9");
        lista.add("Jan10");
        Collections.sort(lista);
        lista.remove(0);
        for(String position : lista){
            System.out.println(position);
        }

    }
}