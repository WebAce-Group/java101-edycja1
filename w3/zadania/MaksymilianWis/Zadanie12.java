package w3.zadania.MaksymilianWis;
import java.util.ArrayList;
import java.util.Collections;

public class Zadanie12 {
    

    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("michal");
        lista.add("piotr");
        lista.add("ada");
        lista.add("kasia");
        lista.add("jozef");
        lista.add("eliasz");
        lista.add("lukasz");
        lista.add("chris");
        lista.add("chris");
        lista.add("adam");

        Collections.sort(lista);

        for(int i=0; i<10; i++)
        {
            System.out.println(lista.get(i));
        }

}
}
