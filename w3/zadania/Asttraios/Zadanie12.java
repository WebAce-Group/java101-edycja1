import java.util.*;
import java.util.Scanner;
public class Zadanie12 {

    public static void main(String [] args){

        ArrayList<String> checkList = new ArrayList<String>();
        Scanner input= new Scanner(System.in);

        System.out.println("Podaj po kolei imiona: ");
        for(int i=0; i<10; i++)
        {
            checkList.add(input.nextLine());
        }
        input.close();

       Collections.sort(checkList);

        checkList.remove(0);

        System.out.println("--------------");

        for(String name: checkList)
        {
            System.out.println(name);
        }
     
        
    }
    
}
