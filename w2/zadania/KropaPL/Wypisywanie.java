//Napisz program, który wypisze wszystkie liczby z zakresu 1-100,
//ale tylko te, które są podzielne przez 3. Wypisywanie liczb powinno się
//zakończyć, gdy program napotka liczbę 50.
public class Wypisywanie {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if(i%3==0) {
                System.out.println(i);
            }
            if (i == 50){
                break;
            }
        }
    }
}