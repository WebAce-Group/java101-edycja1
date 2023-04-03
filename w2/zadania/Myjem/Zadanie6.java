import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean uwu = true;
        int l, suma = 0;
        System.out.println("Podawaj liczby ktore chcesz zsumowac (wpisz 0 aby zakonczyc program");
        while(uwu)
        {
            l = scanner.nextInt();
            suma += l;
            if(l == 0)
                uwu = false;
        }
        System.out.println(suma);
    }
}
