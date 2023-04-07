package Zadanie_16;

public class main {
    public static void main(String[] args){
        KontoBankowe kontoBankowe = new KontoBankowe("43 1321 3241 2315 5651",1000);
        kontoBankowe.Wplacanie(50);
        kontoBankowe.Wybieranie(120);
        System.out.println(kontoBankowe.getSaldo());
    }
}
