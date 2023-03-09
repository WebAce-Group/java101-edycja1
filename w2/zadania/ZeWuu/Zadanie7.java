import java.util.Scanner;
public class Zadanie7{
    public static void main(String[] args){
        int b;
        int a=0;
        int suma=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podawaj liczby calkowite do obliczenia sredniej (liczba wieksza od 100 konczy petle)");
        do{
            b=scanner.nextInt();
            suma+=b; //Przyjmijmy ze liczba >100 bedzie wliczana w srednia
            a+=1;
        }while(b<=100);
        double srednia=(double)suma/a;
        System.out.println("Średnia wpisanych liczb:" +srednia);    
    }
}