import java.util.ArrayList;
import java.util.Collections;

public class Zadanie12 {

    public static void main(String[] args) {
        ArrayList<String> imiona = new ArrayList<String>();
        imiona.add("Bob1");
        imiona.add("Bob2");
        imiona.add("Bob3");
        imiona.add("Bob4");
        imiona.add("Bob5");
        imiona.add("Bob11");
        imiona.add("Bob7");
        imiona.add("Bob8");
        imiona.add("Bob9");
        imiona.add("Jermy");

        Collections.sort(imiona);

        for(String i: imiona){
            System.out.println(i);
        }

        
        
    }
}
