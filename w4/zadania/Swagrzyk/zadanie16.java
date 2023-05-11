public class zadanie16 {
    public static void main(String[] args) {
        KontoBankowe ing = new KontoBankowe(456566668,1000000);
        ing.wplacanie(100);
        System.out.println("stan srodkow= " +ing.getSaldo());
        ing.wyplacanie(600);
        System.out.println("na koncie "+ing.getNumerKonta()+" zostalo "+ing.getSaldo()+"zl");
    }
}
