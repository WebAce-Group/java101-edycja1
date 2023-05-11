<p align="center"><img src="https://user-images.githubusercontent.com/50357817/234226562-d7c43824-06a2-4fa0-9d02-578747c9874f.svg" alt="baner"></p>

# Piąty wykład Java 101

## Data: **3 kwietnia 2023**

## Miejsce: **Sala D2.2 - C-16 Technopolis - Janiszewskiego 7, 50-372 Wrocław**

## Godzina: **19.00**

---

# Maven Repository

Maven to potężne narzędzie do zarządzania projektami oparte na modelu obiektowym projektu (POM). 
Jest używany do budowania projektów, zarządzania zależnościami i dokumentacją. 
Maven może pomóc uprościć codzienne zadania dla programistów Java i pomóc im w ich projektach poprzez automatyczne 
pobieranie zależności podczas uruchamiania kompilacji Maven. Oznacza to, że jeśli chcesz pobrać zależności, 
nie musisz już odwiedzać oficjalnej strony internetowej każdego oprogramowania. 
Można to teraz szybko zrobić odwiedzając „mvnrepository.com”.

# Instalacja XAMPP

XAMPP to darmowy i łatwy w użyciu pakiet, który zawiera wszystkie narzędzia, które są potrzebne do uruchomienia
serwera Apache, bazy danych MySQL, PHP i Perl. XAMPP jest bardzo łatwy w użyciu i jest dostępny dla systemów
Windows, Linux, Mac OS X i Solaris. 

Instalka XAMPP znajduje się pod tym linkiem: https://www.apachefriends.org/pl/index.html

# Konfiguracja projektu Maven w IntelliJ

1. Twoim pierwszym krokiem będzie utworzenie nowego projektu Maven. W tym celu otwórz IntelliJ IDEA i wybierz
File -> New -> Project. W oknie dialogowym wybierz Maven i kliknij Next. W następnym oknie dialogowym wpisz
nazwę projektu i kliknij Finish.
2. Do pliku pom.xml dodajemy zależności, które są potrzebne do uruchomienia projektu. Na tym wykładzie, korzystaliśmy
z następujących zależności:

```xml
    <dependencies>
        <dependency>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-dependency-plugin</artifactId>
            <version>3.2.0</version>
        </dependency>
        <dependency>
            <groupId>org.xerial</groupId>
            <artifactId>sqlite-jdbc</artifactId>
            <version>3.36.0.3</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.18</version>
        </dependency>
    </dependencies>
```

# Klasa `DatabaseController`

Na zajęciach utowrzyliśmy klasę `DatabaseController`, która odpowiada za połączenie z bazą danych.

```java
public class DatabaseController {

    private Connection connection = null;

    //Konstruktor dla SQLite (lokalna)
    public DatabaseController() {
        this.connection = prepareSQLite();
        boolean wynik = createTable();
        if (createTable()) {
            System.out.println("Wszystko gra, tabela Users gotowa");
        } else {
            System.out.println("Coś poszło nie tak, przy tworzeniu tabeli Users");
        }
    }

    //Konstruktor dla MySQL (XAMPP)
    public DatabaseController(String host, String port, String db, String username, String pwd) {
        this.connection = prepareMySQL(host, port, db, username, pwd);
        if (connection == null) {
            System.out.println("Nie udało się nawiązać połączenia");
            return;
        }
        if (createTable()) {
            System.out.println("Wszystko gra, tabela Users gotowa");
        } else {
            System.out.println("Coś poszło nie tak, przy tworzeniu tabeli Users");
        }
    }
}
```

Powyższe konstruktory odpowiadają za połączenie z bazą danych. W pierwszym przypadku korzystamy z lokalnej bazy danych SQLite, a w drugim z zewnętrznej bazy danych MySQL,
z naszego serwera XAMPP.

Reszta metod znajduje się w pliku `DatabaseController.java` załączonym do tego wykładu.

# Klasa `User`

Klasa `User` odpowiada za przechowywanie danych użytkownika, które są reprezentacją rekordu w bazie danych.

```java
public class User {
    private String username;
    private String email;

    public User( String username, String email){
        this.username = username;
        this.email = email;
    }

    public String toString(){
        return "Username: " + this.username + "\nEmail: " + this.email + "\n\n";
    }

    public String getUsername(){
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }
}
```

# Klasa `Main`

W klasie `Main` znajduje się metoda `main`, która odpowiada za uruchomienie aplikacji.

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //DatabaseController sqliteControl = new DatabaseController();

        DatabaseController mysqlControl = new DatabaseController(
                "localhost",
                "3306",
                "java101",
                "root",
                ""
        );

        User user1 = new User("Adrian", "test@gmail.com");
        User user2 = new User("Michał", "michal@gmail.com");
        User user3 = new User("Piotrek", "piotrek@gmail.com");
        mysqlControl.addUser(user1);
        mysqlControl.addUser(user2);
        mysqlControl.addUser(user3);

        ArrayList<User> users = mysqlControl.getUserByEmail("test@gmail.com");

        for (User user : users){
            System.out.println(user.toString());
        }
    }
}
```

# Zadanie
Z obecnego wykładu, tak jak z następnych, nie będzie zadań domowych,
ale zachęcam do samodzielnego eksperymentowania z kodem i tworzenia własnych projektów.

W razie pytań zapraszam do kontaktu na Discordzie i na messengerze :)
