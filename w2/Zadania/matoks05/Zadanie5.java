import java.util.Scanner;
public class Zadanie5 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj calkowita liczbe n: ");
        int liczba = scan.nextInt();
        System.out.println("Rozwiazanie podpunktu a: ");
        for (int i = 1; i<liczba+1; i++){
           System.out.println(i);
        }
        System.out.println("Rozwiazanie podpunktu b: ");
        for(int i = liczba; i>0; i--){
            System.out.println(i);
        }
        System.out.println("Rozwiazanie podpunktu c: ");
        for(int k = 1; k < liczba+1; k++){
            if(k%3==0 || k%5==0){
               System.out.println(k);
            }
        }
        System.out.println("Rozwiazanie podpunktu d: ");
        for(int j = 1; j < liczba+1; j++){
            if((j%3==0 || j%5==0) && !(j%3==0 && j%5==0)){
                System.out.println(j);
            }
        }
    }
}
