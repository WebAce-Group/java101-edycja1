package org.example;

public class Main {
    public static void main(String[] args)
    {
        KontoBankowe Janusz = new KontoBankowe(123456789, 2500);
        Janusz.getSaldo();
        Janusz.wplac(500);
        Janusz.getSaldo();
        Janusz.wyplac(1000);
        Janusz.getSaldo();
    }
}
