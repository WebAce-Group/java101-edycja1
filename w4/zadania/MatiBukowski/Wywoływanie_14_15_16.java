package w4.zadania.MatiBukowski;

public class Wywoływanie_14_15_16 {
    public static void main(String[] args) {
        System.out.println("Zadanie 14: " );
        Rectangle rec = new Rectangle(2.5, 3.5);
        System.out.println("Pole prostokąta: " + rec.getArea());
        System.out.println("Obwód prostokąta: " + rec.getPerimetr());

        System.out.println("\nZadanie 15: " );
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.print("Animal's sound: ");
        animal.makeSound();
        System.out.print("Dog's sound: ");
        dog.makeSound();
        System.out.print("Cat's sound: ");
        cat.makeSound();

        System.out.println("\nZadanie 16: " );
        KontoBankowe konto = new KontoBankowe(18946, 540000);
        System.out.println("Stan konta: " + konto.getSaldo());
        konto.wplacanie(200000);
        System.out.println("Stan konta po wpłacie: " + konto.getSaldo());
        konto.wyplacanie(30000);
        System.out.println("Stan konta po wypłacie: " + konto.getSaldo());

    }
}
