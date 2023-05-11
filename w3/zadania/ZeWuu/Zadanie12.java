import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Zadanie12{
    public static void main(String[] args){
        List<String> Lista =  new ArrayList<>();
        Lista.add("Patrycja");
        Lista.add("Ania");
        Lista.add("Daniel");
        Lista.add("Bartek");
        Lista.add("Mateusz");
        Lista.add("Maciek");
        Lista.add("Karolina");
        Lista.add("Marysia");
        Lista.add("Daria");
        Lista.add("Alicja");
        Lista.sort(null); //Najpierw sortuje, póżniej usuwa.
        Lista.remove(0);
        for(String i : Lista){
            System.out.println(i);
        }
    }
}