
public class Main {
    public static void main(String[] args) {
        KontoBankowe konto1 = new KontoBankowe(12345678, 1000);

        System.out.println(konto1.stanKonta());

        konto1.wyplata(100);
        System.out.println(konto1.stanKonta());
        
        konto1.wplata(10);
        System.out.println(konto1.stanKonta());
    }
}
