<p align="center"><img src="https://user-images.githubusercontent.com/50357817/227961411-ed16e337-8455-4bde-96ed-8a605f6097b5.svg" alt="baner"></p>


# Czwarty wykład Java 101

## Data: **27 marca 2023**

## Miejsce: **Sala D2.2 - C-16 Technopolis - Janiszewskiego 7, 50-372 Wrocław**

## Godzina: **19.00**
___

## OOP (Object-Oriented Programming)


OOP to paradygmat programowania, który wykorzystuje obiekty i ich interakcje do projektowania aplikacji i programów komputerowych. Podstawowe pojęcia OOP obejmują klasy, obiekty, dziedziczenie, enkapsulację, abstrakcję i polimorfizm. Przykład OOP w życiu codziennym można zobaczyć w firmie produkującej samochody. Firma może mieć klasę Car, która definiuje wspólne atrybuty i zachowania wszystkich samochodów, takie jak liczba kół, rodzaj silnika i zdolność do jazdy. Następnie firma może tworzyć podklasy dla konkretnych modeli samochodów, takich jak Sedan, SUV i Ciężarówka, które dziedziczą wspólne atrybuty i zachowania z klasy Car i dodają własne unikalne atrybuty i zachowania.

Tutaj przedstawiam przykładowy kod prezentujący tworzenie klasy oraz jej obiektów:

```java
public class Car {
    // Atrybuty klasy Car
    private int numberOfWheels;
    private String engineType;
    private boolean canDrive;

    // Konstruktor klasy Car
    public Car(int numberOfWheels, String engineType, boolean canDrive) {
        this.numberOfWheels = numberOfWheels;
        this.engineType = engineType;
        this.canDrive = canDrive;
    }

    // Metody klasy Car
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public boolean getCanDrive() {
        return canDrive;
    }
}

// Tworzenie obiektów klasy Car
Car sedan = new Car(4, "gasoline", true);
Car suv = new Car(4, "diesel", true);
Car truck = new Car(6, "diesel", true);
```

## Konstruktory

W języku Java konstruktor to specjalna metoda, która jest wywoływana podczas tworzenia obiektu (instancjonowania) za pomocą słowa kluczowego new. Celem konstruktora jest inicjalizacja atrybutów obiektu wartościami domyślnymi lub podanymi przez użytkownika. Konstruktor ma taką samą nazwę jak klasa i nie ma typu zwracanego.

### Konstruktor domyślny 

Jeśli klasa nie definiuje jawnie żadnych konstruktorów, kompilator Java automatycznie dostarcza domyślny konstruktor bez argumentów, który inicjalizuje wszystkie zmienne instancji ich wartościami domyślnymi (0 dla typów numerycznych, false dla boolean i null dla typów referencyjnych).

```java
class Circle {
    double radius;

    double getArea() {
        return Math.PI * radius * radius;
    }
}

Circle circle = new Circle();
System.out.println(circle.getArea());
```

W tym przykładzie klasa Circle nie definiuje jawnie żadnych konstruktorów, więc kompilator Java automatycznie dostarcza domyślny konstruktor, który inicjalizuje atrybut radius jego wartością domyślną 0.

### Przeciążanie konstruktora

Klasa może mieć wiele konstruktorów z różną liczbą i rodzajami argumentów. Nazywa się to przeciążaniem konstruktora.

```java
class Rectangle {
    int length;
    int width;

    // Konstruktor bez argumentów
    Rectangle() {
        length = 0;
        width = 0;
    }

    // Konstruktor z jednym argumentem
    Rectangle(int side) {
        length = side;
        width = side;
    }

    // Konstruktor z dwoma argumentami
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int getArea() {
        return length * width;
    }
}

Rectangle rect1 = new Rectangle();
Rectangle rect2 = new Rectangle(10);
Rectangle rect3 = new Rectangle(10, 20);

System.out.println(rect1.getArea());
System.out.println(rect2.getArea());
System.out.println(rect3.getArea());
```

W tym przykładzie klasa Rectangle ma trzy konstruktory z różną liczbą argumentów. Pierwszy konstruktor nie przyjmuje żadnych argumentów i inicjalizuje atrybuty length i width wartością 0. Drugi konstruktor przyjmuje jeden argument i inicjalizuje zarówno atrybut length jak i width wartością argumentu. Trzeci konstruktor przyjmuje dwa argumenty i inicjalizuje atrybuty length i width wartościami argumentów.


Java nie ma destruktorów jak C++. Zamiast tego polega na automatycznym zwalnianiu pamięci przez garbage collection, która nie jest już używana przez obiekty. Gdy obiekt przestaje być referowany przez jakąkolwiek zmienną, staje się kandydatem do garbage collection i jego pamięć może być odzyskana przez system.

## Dziedziczenie i polimorfizm

**Polimorfizm** pozwala traktować obiekty różnych klas jako obiekty wspólnej nadklasy. **Dziedziczenie** to mechanizm, który pozwala na tworzenie nowej klasy na podstawie istniejącej klasy poprzez dziedziczenie jej atrybutów i zachowań. Dziedziczenie wskazujemy, przy tworzeniu nowej klasy przy pomocy słowa kluczowego **extends**. Przykład polimorfizmu i dziedziczenia w życiu codziennym można zobaczyć w systemie zarządzania zoo. System może mieć klasę Animal, która definiuje wspólne atrybuty i zachowania wszystkich zwierząt, takie jak ich imię, wiek i zdolność do jedzenia. Następnie system może tworzyć podklasy dla konkretnych gatunków zwierząt, takich jak Lew, Żyrafa i Pingwin, które dziedziczą wspólne atrybuty i zachowania z klasy Animal i dodają własne unikalne atrybuty i zachowania. Polimorfizm pozwala systemowi traktować wszystkie zwierzęta jako obiekty klasy Animal, nawet jeśli należą do różnych podklas.

```java
class Animal {
    String name;
    int age;
    void eat() {
        System.out.println("Eating");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Roaring");
    }
}

class Giraffe extends Animal {
    void stretchNeck() {
        System.out.println("Stretching neck");
    }
}

class Penguin extends Animal {
    void waddle() {
        System.out.println("Waddling");
    }
}

Lion animal1 = new Lion();
Giraffe animal2 = new Giraffe();
Penguin animal3 = new Penguin();

animal1.eat();
animal2.eat();
animal3.eat();
animal1.roar();
animal2.stretchNeck();
animal3.waddle();
```

## Modyfikatory dostępu

Modyfikatory dostępu to słowa kluczowe, które określają widoczność i dostępność elementów klasy (pól i metod). W języku Java są cztery modyfikatory dostępu:
- public,
- private,
- protected
- default (bez modyfikatora).


Przykład modyfikatorów dostępu w życiu codziennym można zobaczyć w systemie zarządzania kontami bankowymi. System może mieć klasę BankAccount, która definiuje wspólne atrybuty i zachowania wszystkich kont bankowych, takie jak numer konta, saldo i możliwość wpłacania i wypłacania pieniędzy. Klasa BankAccount może używać modyfikatorów dostępu do kontrolowania widoczności i dostępności swoich atrybutów i metod. Na przykład atrybut saldo może być zadeklarowany jako private, aby zapobiec bezpośredniemu dostępowi z zewnątrz klasy, podczas gdy metody wpłaty i wypłaty mogą być zadeklarowane jako publiczne, aby umożliwić dostęp z zewnątrz klasy.

```java
class BankAccount {
    private int accountNumber;
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

BankAccount account = new BankAccount();
account.deposit(100);
account.withdraw(50);
System.out.println(account.getBalance());
```

### Modyfikator protected - rozwinięcie

Gdy element klasy jest zadeklarowany jako protected, można go uzyskać dostęp:

- W tej samej klasie, w której został zadeklarowany. 
- W dowolnej podklasie klasy, w której został zadeklarowany, nawet jeśli podklasa znajduje się w innym pakiecie. 
- W dowolnej klasie w tym samym pakiecie co klasa, w której został zadeklarowany. 

Oto przykład, który pokazuje użycie modyfikatora dostępu protected w języku Java:

```java
package package1;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}
```

```java
package package1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void printName() {
        System.out.println(name);
    }
}
```
```java
package package2;

import package1.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void printName() {
        System.out.println(name);
    }
}

Dog dog = new Dog("Buddy");
dog.printName();

Cat cat = new Cat("Whiskers");
cat.printName();
```

W tym przykładzie klasa Animal ma chroniony atrybut name, który można uzyskać dostęp w tej samej klasie, w dowolnej podklasie (takiej jak klasy Dog i Cat) oraz w dowolnej klasie w tym samym pakiecie (takiej jak klasa Dog). Modyfikator dostępu protected jest ważny, ponieważ zapewnia poziom enkapsulacji pośredni między publicznym a prywatnym. Pozwala podklasom i klasom w tym samym pakiecie na dostęp do elementów klasy, jednocześnie ukrywając je przed światem zewnętrznym.

Może to być przydatne w sytuacjach, gdy chcesz pozwolić podklasom na dostęp i modyfikację wewnętrznego stanu swojej nadklasy, ale nie chcesz ujawniać tego stanu światu zewnętrznemu. Na przykład rozważ klasę Shape, która ma atrybut color. Możesz chcieć pozwolić podklasom takim jak Circle i Rectangle na dostęp i modyfikację atrybutu color, ale nie chcesz go ujawniać światu zewnętrznemu. W tym przypadku możesz zadeklarować atrybut color jako protected.

Korzystanie z modyfikatora dostępu protected może również pomóc w poprawie ponownego wykorzystania kodu i jego utrzymania. Pozwalając podklasom na dostęp i modyfikację wewnętrznego stanu swojej nadklasy, możesz uniknąć powielania kodu w każdej podklasie i ułatwić zmianę implementacji nadklasy bez wpływu na jej podklasy.

## Abstrakcja

Abstrakcja to kolejna podstawowa zasada programowania zorientowanego na obiekty (OOP), obok dziedziczenia, enkapsulacji i polimorfizmu. Odnosi się do procesu ujawniania tylko istotnych i odpowiednich szczegółów obiektu światu zewnętrznemu, jednocześnie ukrywając jego wewnętrzne działanie.

Abstrakcja jest używana do zmniejszenia złożoności i zwiększenia ponownego wykorzystania poprzez oddzielenie interfejsu obiektu (co może zrobić) od jego implementacji (jak to robi). Pozwala to użytkownikowi obiektu na interakcję z nim bez konieczności znajomości jego wewnętrznych szczegółów.

W Javie abstrakcję można osiągnąć za pomocą klas abstrakcyjnych i interfejsów. Klasa abstrakcyjna to klasa, która nie może być zinstancjonowana i służy do zapewnienia wspólnego interfejsu dla swoich podklas. Interfejs to zbiór metod abstrakcyjnych (metod bez ciała), które muszą być zaimplementowane przez każdą klasę, która implementuje interfejs.

Oto przykład demonstrujący abstrakcję w Javie:

```java
interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

Shape shape1 = new Circle(5);
Shape shape2 = new Rectangle(10, 20);
```

W tym przykładzie interfejs Shape zapewnia abstrakcyjną metodę getArea, która musi być zaimplementowana przez każdą klasę implementującą interfejsu Shape. Klasy Circle i Rectangle implementują interfejs Shape i zapewniają własną implementację metody getArea. W ten sposób użytkownik interfejsu Shape może wchodzić w interakcję z obiektami klas Circle i Rectangle bez konieczności znajomości ich wewnętrznych szczegółów.


## Enkapsulacja

Enkapsulacja to jedna z czterech podstawowych zasad programowania zorientowanego na obiekty (OOP), obok dziedziczenia, abstrakcji i polimorfizmu. Odnosi się do łączenia danych (atrybutów) i metod (zachowań) działających na tych danych w jednej jednostce, zwykle klasie.

Enkapsulacja jest używana do ukrywania wewnętrznych szczegółów obiektu i ochrony jego danych przed bezpośrednim dostępem lub modyfikacją z zewnątrz obiektu. Jest to osiągane poprzez deklarowanie atrybutów klasy jako prywatnych i zapewnienie publicznych metod (znanych również jako metody dostępu i modyfikacji) do dostępu i modyfikacji wartości tych atrybutów.

Oto przykład demonstrujący enkapsulację w Javie:

```java
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

BankAccount account = new BankAccount();
account.deposit(100);
account.withdraw(50);
System.out.println(account.getBalance());
```

W tym przykładzie klasa BankAccount enkapsuluje atrybut balance, deklarując go jako prywatny i zapewniając publiczne metody deposit, withdraw i getBalance do dostępu i modyfikacji jego wartości. W ten sposób wewnętrzne szczegóły klasy BankAccount są ukryte przed światem zewnętrznym, a jej dane są chronione przed bezpośrednim dostępem lub modyfikacją.

## Obsługa plików

Java udostępnia kilka klas do odczytu z plików i zapisu do nich, takich jak FileReader, BufferedReader, FileWriter i BufferedWriter.


Przykładem użycia wejścia/wyjścia plików w rzeczywistym życiu może być system zarządzania studentami. System może używać wejścia/wyjścia plików do odczytu danych studentów z pliku, przetworzenia ich, a następnie zapisania zaktualizowanych danych z powrotem do pliku. Na przykład system może użyć FileReader i BufferedReader do odczytu danych studentów z pliku CSV, a następnie użyć FileWriter i BufferedWriter do zapisania zaktualizowanych danych z powrotem do pliku.


```java
import java.io.*;

class StudentManagementSystem {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("students.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("students.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Write updated student data
        bufferedWriter.write("John,Doe,4.0\n");

        bufferedWriter.close();
    }
}
```


## [Zadania do wykoniania](zadanie.md)
