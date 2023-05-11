
   class Animal {
        String name;

        public Animal() {
            name = "Stefan";
        }

        public Animal(String name) {
            name = this.name;
        }

        public void makeSound() {
            System.out.println("Animal Sound");
        }
    }

    class Dog extends Animal {
        public Dog() {
            this.name = "Burek";
        }

        public Dog(String name) {
            name = this.name;
        }

        @Override
        public void makeSound() {
            System.out.println("Woof");
        }

    }

    class Cat extends Animal {
        public Cat() {
            this.name = "Mruczek";
        }

        public Cat(String name) {
            name = this.name;
        }

        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public class Zadanie15 {

        public static void main(String[] args) {

            Animal p = new Animal("Tak");
            p.makeSound();
            Cat c;
            c = new Cat("StefanKotBezImienia");
            c.makeSound();
            Dog d = new Dog();
            d.makeSound();
        }
    }






