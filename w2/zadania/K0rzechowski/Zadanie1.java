import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        //zad 3

//        Scanner scaner = new Scanner(System.in);
//        System.out.println("Podaj pierwszy bok trójkąta: ");
//        int bok1 = scaner.nextInt();
//        System.out.println("Podaj drugi bok trójkąta: ");
//        int bok2 = scaner.nextInt();
//        System.out.println("Podaj trzeci bok trójkąta: ");
//        int bok3 = scaner.nextInt();
//
//
//
//        if (bok1<bok2+bok3 && bok2<bok1+bok3 && bok3<bok1+bok2 ){
//            if (bok1==bok2 && bok2==bok3 && bok1==bok3) {
//                System.out.println("Jest to trójkąt równoboczny");
//            } else if (bok1==bok2 || bok2==bok3 || bok1==bok3) {
//                System.out.println("Jest to trójkąt jest równoramienny");
//            } else {
//                System.out.println("Jest to trójkąt jest róźnoboczny");
//            }
//        } else {
//            System.out.println("Z podanych boków nie da się zbudować trójkąta");
//        }

        //zad 4

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Wpisz liczbę do kwartału : ");
//        int wybor = scanner.nextInt();
//
//        switch (wybor) {
//            case 1, 2, 3:
//                System.out.println("Numer miesiąca " + wybor + " to pierwszy kwartał");
//                break;
//            case 4, 5, 6:
//                System.out.println("Numer miesiąca " + wybor + " to drugi kwartał");
//                break;
//            case 7, 8, 9:
//                System.out.println("Numer miesiąca " + wybor + " to trzeci kwartał");
//                break;
//            case 10, 11, 12:
//                System.out.println("Numer miesiąca " + wybor + " to czwarty kwartał");
//                break;
//            default:
//                System.out.println("Podałeś zły numer miesiąca");
//        }
//
//        System.out.print("Wpisz numer dnia tygodnia: ");
//        int dzien = scanner.nextInt();
//        String dzient = switch (dzien) {
//            case 1:
//                yield "Poniedziałek";
//            case 2:
//                yield "Wtorek";
//            case 3:
//                yield "Środa";
//            case 4:
//                yield "Czwartek";
//            case 5:
//                yield "Piątek";
//            case 6:
//                yield "Sobota";
//            case 7:
//                yield "Niedziela";
//            default:
//                yield "Zły dzień tygodnia";
//        };
//        System.out.println(dzient);

        //Zad 5

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj n-tą liczbę: ");
//        int n = scanner.nextInt();
//        for (int i = 1; i < n+1; i++) {
//            System.out.println("Liczby w góre "+i);
//        }
//        System.out.println("____________________________");
//        for (int i = n; i > 0; i--) {
//            System.out.println("Liczby w dół "+i);
//        }
//        System.out.println("____________________________");

//        for (int i = 1; i < n+1; i++) {
//            if (i%3==0 || i%5==0){
//                System.out.println("Liczby podzielne to: "+i);
//
//            }
//        }
//        System.out.println("____________________________");
//
//        for (int i = 1; i < n+1; i++) {
//            if (i%3==0 && i%5==0){
//
//            } else if (i%3==0) {
//                System.out.println("Liczba podzielna przez 3 to: "+i);
//            }
//            else if(i%5==0){
//                System.out.println("Liczba podzielna przez 5 to: "+i);
//            }
//
//        }

        //Zad 6

//        boolean warunek = true;
//        Scanner scanner = new Scanner(System.in);
//        int suma=0;
//        while (warunek){
//            System.out.print("Podaj liczbe do sumy: ");
//            int liczba =scanner.nextInt();
//
//            if (liczba!=0){
//                suma+=liczba;
//            }
//            else {
//                warunek=false;
//                System.out.println("Suma liczb wynosi: "+suma);
//            }
//
//        }

        //Zad 7

//        Scanner scanner = new Scanner(System.in);
//        int suma = 0;
//        int licznik = 0;
//        int liczba;
//        do {
//            System.out.print("Podaj liczbe: ");
//            liczba = scanner.nextInt();
//            if (liczba>100) {
//                suma += liczba;
//                licznik++;
//            }
//
//        } while (liczba > 100);
//        System.out.println("Średnia liczb to: "+(suma/licznik));
//

        //Zad 8

//        for (int i = 1; i <=100 ; i++) {
//            if (i==50){
//                break;
//            }else if (i%3!=0){
//                continue;
//            }
//            System.out.println("Liczba: "+i);
//
//        }





        }

}
