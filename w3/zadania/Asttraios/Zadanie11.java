import java.util.*;
import java.util.Scanner;
public class Zadanie11 {
    
    public static void main(String [] args) {
        
        int [] tab1=new int[10];
        Arrays.fill(tab1, 0); 

        int [] tab2= new int[10];
       
        Scanner input= new Scanner(System.in);

        System.out.println("Podaj elementy tablicy");
      
        for(int i=0; i<10; i++)
        {
            tab2[i]=input.nextInt();
        }
        
        input.close();

        System.out.println("-----------------");

        Arrays.sort(tab1);
        Arrays.sort(tab2);

        for(int elem2: tab1)
        {
            System.out.println(elem2);
        }

       
        System.out.println("----------------------");
        for(int e: tab2)
        {
            System.out.println(e);
        }

    }

}
