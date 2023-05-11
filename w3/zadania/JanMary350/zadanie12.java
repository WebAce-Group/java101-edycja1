import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class zadanie12 {
    public static void main(String[] args){
        ArrayList<String>lista = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<10; i++){
//            String names = scanner.nextLine();
            lista.add(scanner.nextLine());
        }
        Collections.sort(lista);
        lista.remove(0);
        for(String name : lista){
            System.out.println(name);
        }

    }
}
