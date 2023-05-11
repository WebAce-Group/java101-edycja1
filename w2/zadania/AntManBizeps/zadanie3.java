import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class zadanie3 {
    public static void main(String[] args) {
        int sides[];
        sides = new int[3];

        Scanner putLength = new Scanner(System.in);
        
        for(int i=0; i<3; i++){
            System.out.print("Podaj długość boku " + (i+1) + ": ");
            sides[i] = putLength.nextInt();
        }
        
        Arrays.sort(sides);

        if ((sides[0] + sides[1])>sides[2]) {
            Set<Integer> sidesSet = new HashSet<Integer>(); 

            for (int i=0; i<3; i++) {
                sidesSet.add(sides[i]);
            }
            
            switch (sidesSet.size()) {
                case 3:
                    System.out.println("Jest to trójkąt różnoboczny");
                    break;
                case 2:
                    System.out.println("Jest to trójkąt równoramienny");
                    break;
                case 1:
                    System.out.println("Jest to trójkąt równoboczny");
                    break;
            
                default:
                    System.out.println("Coś mi się tutaj nie zgadza");
                    break;
            }

        } else System.out.println("To nie jest trójkąt");


    }
    
} 