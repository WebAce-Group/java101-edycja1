public class Zadanie16 {
    public static void main(String[] args) {

        KontoBankowe kontopanamarka = new KontoBankowe("83631846254937838",666);
        kontopanamarka.wplac(420);
        System.out.println(kontopanamarka.getSaldo());
        kontopanamarka.wyplac(666);
        System.out.println(kontopanamarka.getSaldo());

    }
}
