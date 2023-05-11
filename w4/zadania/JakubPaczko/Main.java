public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.MakeSound();
        cat.MakeSound();
        dog.MakeSound();

        KontoBankowe kontoBankowe = new KontoBankowe(12345679, 500);

        kontoBankowe.Wyplac(1000);
        System.out.println(kontoBankowe.GetSaldo());
        kontoBankowe.Wplac(500);
        System.out.println(kontoBankowe.GetSaldo());
        kontoBankowe.Wyplac(128);
        System.out.println(kontoBankowe.GetSaldo());
    }
}