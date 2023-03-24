package w2.zadania.Ostry;

public class Main {
    public static void main(String[] args) {
        /*
        Zad3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dlugosc bokow trojkata");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && b + c > a && a + c > b){
            if (a == b && b == c)
                System.out.println("Trojkat rownoboczny");
            else if (a == b || b == c || a == c)
                System.out.println("Trojkat rownoramienny");
            else
                System.out.println("Trojkat roznoboczny");
        }
        else
            System.out.println("Nie zrobisz z tego trojata ziomek");


         */
        //Zad4 nie robiłem normalnego switcha
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz miesiac to powiem ci tajemnice");
        int mies = scanner.nextInt();
        String kwartal = switch (mies){
            case 1: case 2: case 3:
                yield "Pierwszy kwartal";
            case 4: case 5: case 6:
                yield "Drugi kwartal";
            case 7: case 8: case 9:
                yield "Trzeci kwartal";
            case 10: case 11: case 12:
                yield "Czwarty kwartal";
            default:
                throw new IllegalStateException("Unexpected value: " + mies);
        };
        System.out.println(kwartal);




        Zad 5
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0;i<=n;i++){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=n;i>=1;i--){
            System.out.println(i);
        }


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0;i<=n;i++){
            if (i%3 ==0 && i%5 ==0)
                System.out.println(i);
        }


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0;i<=n;i++){
            if ((i%3 ==0 && i%5 !=0) || (i%3 !=0 && i%5 == 0))
                System.out.println(i);
        }

        Zad 7
        Scanner scanner = new Scanner(System.in);
        int n;
        int dodawanie = 0;
        int licznik = 0;
        do {
            n = scanner.nextInt();
            dodawanie +=n;
            licznik++;
        }while (n<100);
        System.out.println((double) dodawanie/licznik);

        Zad 6
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean b=true;
        int dodawanie = 0;
        while (b){
            n = scanner.nextInt();
            dodawanie +=n;
            if (n==0)
                b=false;
        }
        System.out.println(dodawanie);

         Zad 8
        for (int i =0;i<=100;i++){
            if (i%3==0)
                System.out.println(i);
            else if (i>=50) {
                break;
            }
        }

         */
    }
}