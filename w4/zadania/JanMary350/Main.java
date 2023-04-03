package wyklad4;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4,5);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();


        KontoBankowe konto = new KontoBankowe(1234, "1241251351245235124");
        System.out.println(konto.getSaldo());
        konto.wplata(1111);
        System.out.println(konto.getSaldo());
        konto.wyplata(777.11F);
        System.out.println(konto.getSaldo());
    }
}