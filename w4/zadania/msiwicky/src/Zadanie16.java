public class Zadanie16 {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe = new KontoBankowe(1234565, 765.4);
        System.out.println(kontoBankowe.getSaldo());
        kontoBankowe.addMoney(1234);
        System.out.println(kontoBankowe.getSaldo());
        kontoBankowe.withdrawMoney(321);
        System.out.println(kontoBankowe.getSaldo());

    }
}
