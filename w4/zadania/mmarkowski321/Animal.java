package w4.zadania.mmarkowski321;

public class Animal {

    void makeSound() {
        System.out.println("Animal Sound");
    }

}
class Cat extends Animal {
    void makeSound(){
        System.out.println("Wooof");
    }
}

class Dog extends Animal {
    void makeSound(){
        System.out.println("Meowww");
    }
}



