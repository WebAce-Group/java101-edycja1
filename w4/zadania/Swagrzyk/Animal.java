public class Animal {
    String sound;
    void makeSound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    void chau(){
        System.out.println("WOOF");
    }
}
class Cat extends Animal{
    void miau(){
        System.out.println("MEOW");
    }
}

