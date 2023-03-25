import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj boki trójkąta: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        if (side1 == side2 && side2 == side3){
            System.out.println("Trójkąt jest równoboczny");
        }
        else {
                if (side1 + side2 + side3 <= 2*max(side1, max(side2, side3))) {
                    System.out.println("Nie da się zbudować trójkąta");
                } else {
                    if (side1 == side2 || side2 == side3 || side1 == side3) {
                        System.out.println("Trójkąt jest równoramienny");
                    }
                    else{
                        System.out.println("Trójkąt jest różnoboczny");
                    }
                }

        }
    }
}