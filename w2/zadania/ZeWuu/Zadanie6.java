import java.util.Scanner;
public class Zadanie6{
    public static void main(String[] args){
        boolean a=true;
        int b;
        int suma=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podawaj liczby calkowite do zsumowania (0 konczy petle)");
        while(a==true){
            b=scanner.nextInt();
            if(b==0)a=false;
            else suma+=b;
        }
        System.out.println("Suma wpisanych liczb:" +suma);
    }
}