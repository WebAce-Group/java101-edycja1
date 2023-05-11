package w3.zadania.Ziolo03;
import java.util.ArrayList;
import java.util.Collections;

    public class Zadanie12 {
        //zakladam ze chodzilo o to ze mamy z gory powiedziane imiona
        public static void main(String[] args){
            ArrayList<String> imiona = new ArrayList<>();
            imiona.add("Jan");
            imiona.add("Pawel");
            imiona.add("Drugi");
            imiona.add("Patryk");
            imiona.add("Zdzislaw");
            imiona.add("Dzieci");
            imiona.add("Kasia");
            imiona.add("Basia");
            imiona.add("Masza");
            imiona.add("Male");

            Collections.sort(imiona);
            imiona.remove(0);
            for(String element : imiona){
                System.out.print(element+"\t");
            }

        }
    }

