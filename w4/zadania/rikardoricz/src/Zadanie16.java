public class Zadanie16 {
    public static void main(String[] args) {
        KontoBankowe mojeKonto = new KontoBankowe("PL80111122223333444455556666", 120.00);
        System.out.println("Saldo mojego konta: " + mojeKonto.getSaldo());

        mojeKonto.deposit(50);
        System.out.println("Saldo mojego konta: " + mojeKonto.getSaldo());

        mojeKonto.withdraw(200);
        mojeKonto.withdraw(100);
        System.out.println("Saldo mojego konta: " + mojeKonto.getSaldo());
    }
}