public class Zadanie8 {
    public static void main(String[] args) {
        // Napisz program, który wypisze wszystkie liczby z zakresu 1-100,
        // ale tylko te, które są podzielne przez 3.
        // Wypisywanie liczb powinno się zakończyć, gdy program napotka liczbę 50.
        for (int i = 0; i < 101; i++) {
            if (i == 50) {
                break;
            }
            else if (i % 3 != 0) {
                continue;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
