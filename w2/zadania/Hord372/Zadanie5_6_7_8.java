import java.util.Scanner;
public class Zadanie5_6_7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz zadanie z petli:\n" +
                "5=Zadanie 5\n6=Zadanie 6\n7=Zadanie 7\n8=Zadanie 8");
        int p = scanner.nextInt();
        switch (p) {
            case 5:
                System.out.println("Podaj liczbe:");
                int n = scanner.nextInt();
                int t = n;
                for (int x = 1; x <= n; x++) {
                    System.out.println(x);
                }
                for (int x = 1; x <= t; t--) {
                    System.out.println(t);
                }
                for (int x = 1; x <= n; x++) {
                    if (x % 3 == 0 || x % 5 == 0) {
                        System.out.println(x);
                    }
                }
                for (int x = 1; x <= n; x++) {
                    if (x % 3 == 0 || x % 5 == 0) {
                        if (x % 15 != 0)
                            System.out.println(x);
                    }
                }
                break;
                case 6:
                    boolean q=true;
                    int z = scanner.nextInt();
                    int suma=z;
                    System.out.println(suma);
                    while(z!=0){
                        z = scanner.nextInt();
                        suma += z;
                        System.out.println(suma);
                    }
                break;
            case 7:
                System.out.println("Podaj liczbe całkowitą");
                int x = scanner.nextInt();
                double sumaryt=x;
                int numer=1;
                System.out.println(sumaryt);

                while(x<=100){
                    x = scanner.nextInt();
                    numer++;
                    sumaryt = (sumaryt + x)/numer;
                    System.out.println(sumaryt);
                }
                break;
            case 8:

                for (int i=1;i<=100;i++){
                    if (i==50){
                        break;
                    }
                    if (i%3==0){
                        System.out.println(i);
                    }
                }

                break;
            default:
                System.out.println("Nie ma takiego numeru");
        }
    }
}
