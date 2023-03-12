import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean warunek = true;
        int liczba, licznik=0;
        float suma = 0;
        System.out.println("Wpisz calkowite, (liczba>100)=stop");

        do{
            licznik++;
            if((liczba = scanner.nextInt())<=100){
                System.out.println((suma+=liczba)/licznik);
            }
            else {
                warunek = false;
            }
        }while (warunek);
    }
}
