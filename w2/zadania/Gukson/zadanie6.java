import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        boolean x = true;
        Scanner userInterface = new Scanner(System.in);
        int suma = 0, y;
        
        while (x){
            y = userInterface.nextInt();
            suma+=y;
        }
        System.out.println("suma = " + suma);
    }
}