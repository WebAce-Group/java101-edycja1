import java.util.*;
public class Zadanie12 {
    public static void main(String[] args){
        ArrayList<String> imiona = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 imion: ");
        for(int i = 0; i<10; i++){
            imiona.add(scanner.next());
        }
        Collections.sort(imiona);
        imiona.remove(0);
        for (String i : imiona)
        {
            System.out.println(i);
        }
    }
}