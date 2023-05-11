import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args){
        boolean t=true;int suma=0,w;
        Scanner scanner = new Scanner(System.in);
        w = scanner.nextInt();

        while(w!=0){
            suma +=w;
            w = scanner.nextInt();
        }
        System.out.println(suma);
    }
}
