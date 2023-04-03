package w4.zadania.d9one;

public class z16 {
    public static void main(String[] args) {
        KontoBankowe nr1 = new KontoBankowe(1234567890, 42069);
        nr1.depozyt(69);
        System.out.println(nr1.getSaldo());
        nr1.wyplata(42069);
        System.out.println(nr1.getSaldo());
    }
}
