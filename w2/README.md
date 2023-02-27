<p align="center"><img src="https://user-images.githubusercontent.com/50357817/221613373-fc226dda-d779-4275-b935-a728afbbedfd.svg" alt="baner"></p>

# Drugi wykład Java 101

## Data: **27 lutego 2023**

## Miejsce: **Sala D2.1 - C-16 Technopolis - Janiszewskiego 7, 50-372 Wrocław**

## Godzina: **19.00**
___

### **_Konwersja i rzutowanie typów_**

- Konwersja typów - rozszerzająca

W sytuacji, gdy będziemy przez siebie dzielili wartości różnych typów, np. `double` przez `int`, to przed wykonaniem operacji dzielenia wykona się niejawna konwersja rozszerzająca.

```java
double liczba1 = 10.5;
int liczba2 = 5;
double wynik = liczba1 / liczba2; // wynik = 2.1
```

W przypadku, gdyby zmienna `wynik` była typu `int`, to kompilator rzuciłby nam błąd, ponieważ nie jesteśmy w stanie przypisać do zmiennej typu `int` wartości typu `double`.

Ale co zrobić, gdy faktycznie potrzebujemy zamienić typ double na int i część dziesiętna nas nie interesuje?

- Konwersja typów - zawężająca

Konwersja zawężająca musi być wyraźnie zadeklarowana przez programistę. W tym celu wykorzystujemy operator rzutowania.

```java
int liczba1 = 10;
double liczba2 = 5.5;
int wynik = (int) (liczba1 / liczba2); // wynik = 1
```

W powyższym przykładzie najpierw następuje dzielenie - otrzymujemy wynik z przecinkiem, a następnie ucięcie (nie zaokrąglenie!) wyniku. Aby otrzymać przybliżoną wartość wyniku należałoby użyć metody `Math.round()`.

### **_Zapis i konwencja nazewnictwa_**

W Javie istnieje kilka konwencji nazewnictwa, które należy stosować w zależności od typu zmiennej:

- zmienne / metody - camelCase
- klasy - PascalCase
- stałe - UPPER_CASE

np.

```java
static final int MOJA_STALA;

int liczba = 10;
int kolejnaLiczba = 20;

void metoda() {
    // ...
}
void metodaZParametrem(int parametr) {
    // ...
}

class Klasa {
    // ...
}
class KlasaDwa {
    // ...
}
```

### **_Instrukcje sterujące_**

- instrukcja warunkowa `if`

```java
if (warunek) {
    // ...
}

if (warunek) {
    // ...
} else {
    // ...
}

if (warunek) {
    // ...
} else if (warunek2) {
    // ...
} else {
    // ...
}
```

- instrukcja wyboru `switch`

Switch działa tylko na typach całkowitych (byte, short, int, char) oraz typie enum.

```java
switch (liczba){
  case 1:
    // jakieś_instrukcje_1;
    break;
  case 2:
    // jakieś_instrukcje_2;
    break;
  ...
  default:
     // instrukcje, gdy nie znaleziono żadnego pasującego przypadku
}
```

- - `Switch expression`

Switch expression pozwala na przypisanie wartości do zmiennej w zależności od wybranego przypadku. Do tej pory używaliśmy `break`, aby przerwać działanie switcha. W przypadku switch expression będziemy musieli użyć słowa kluczowego `yield`. `Return` nie mógł być tutaj użyty, bo służy do zwracania z metody, a w tym przypadku chcemy zwracać ze switcha.

```java
int miesiac = 2;
String wynik = switch (miesiac) {
    case 1:
        yield "Styczeń";
    case 2:
        yield "Luty";
    case 3:
        yield "Marzec";
    ...
    case 12:
        yield "Grudzień";
    default:
        yield "Nieznany miesiąc";
}
```

- Operator strzałki (->)

Operator strzałki pozwala na zapisanie wyrażenia lambda w jednej linii. W przypadku, gdy wyrażenie lambda składa się z jednej instrukcji, możemy pominąć klamry. W na podstawie powyższego kodu, możemy zapisywać wyrażenia lambda w następujący sposób:

```java
int miesiac = 4;
String wynik = switch (miesiac) {
    case 1 -> "Styczeń";
    case 2 -> "Luty";
    case 3 -> "Marzec";
    ...
    case 12 -> "Grudzień";
    default -> "Nieznany miesiąc";
}
``` 
W jednym bloku case możesz obsłużyć kilka przypadków naraz. Działa to zarówno dla podejścia z yield jak i zapisu z operatorami strzałki.

```java

int miesiac = 3;
String wynik = switch(miesiac){
    case 1, 2, 3 -> "Pierwsze kwartał";
    case 4, 5, 6 -> "Drugi kwartał";
    case 7, 8, 9 -> "Trzeci kwartał";
    case 10, 11, 12 -> "Czwarty kwartał";
    default -> "Nie ma takiego miesiąca";
}

```

### **_Pętle sterujące_**

- pętla `while`

```java
while (warunek) {
    // ...
}
```

- pętla `do-while`

```java
do {
    // ...
} while (warunek);
```

- pętla `for`

```java
for (inicjalizacja; warunek; aktualizacja) {
    // ...
}
```

- pętla `for-each`

```java

typ[] tablica = {elem1, elem2, elem3, ...};
for (typ zmienna : kolekcja/tablica) {
    // ...
}
```

- `Continue` i `break`
  
`Continue` i `break` działają w taki sam sposób jak w innych językach programowania.

`Continue` - przerwanie aktualnej iteracji pętli i przejście do kolejnej iteracji.

`Break` - przerwanie działania pętli.

### **_Zakresy widoczności zmiennych_**

Zakresy widoczności zmiennych w Javie są podobne do tych, które znasz z innych języków programowania. Zmienne deklarowane wewnątrz bloku kodu są widoczne tylko wewnątrz tego bloku. Zmienne deklarowane poza blokiem kodu są widoczne w całym programie.

- Zmienne "globalne" - deklarowane poza blokiem kodu, np. w klasie.

```java
class Klasa {
    int zmiennaGlobalna = 10;

    void metoda() {
        // Tutaj mamy dostęp do zmiennej zmienneGlobalna
    }
}
```

- Zmienne "lokalne" - deklarowane wewnątrz bloku kodu, np. w metodzie.

```java
class Klasa {
    void metoda() {
        int zmiennaLokalna = 10;
        // Tutaj mamy dostęp do zmiennej zmienneLokalna
    }

    int poleKlasy = zmienneLokalna; // Błąd kompilacji
}
```

- Zmienne wewnątrz instrukcji i pętli

Zmienne wewnątrz instrukcji i pętli są widoczne tylko wewnątrz tej instruckji lub pętli i nie moga być używane poza nią.

```java
class Klasa{
    void metoda() {
        if (warunek) {
            int a = 5;
        }
        //tutaj zmienna "a" jest niewidoczna

        for (int i = 0; i < 10; i++) {  //zmienna obowiązuje tylko w pętli
            System.out.println("Java");
        }
    }
}
```

### **_Podstawowe wejście - Klasa Scanner_**

Klasa `Scanner` pozwala na pobieranie danych od użytkownika.
Tę klasę musimy zaimportować, aby móc jej używać.

```java
import java.util.Scanner;
```

- Wczytywanie tekstu

Do wczytywania tekstu najczęściej używamy metody `nextLine()`. Metoda ta zwraca typ `String` i wstrzymuje działanie programu, dopóki użytkownik nie wpisze tekstu i nie naciśnie klawisz `Enter`.

```java
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj swoje imię: ");\
String imie = scanner.nextLine();
System.out.println("Witaj " + imie);
```

Ten kod wyświetli komunikat "Podaj swoje imię: ", a następnie wstrzyma działanie programu, dopóki użytkownik nie wpisze tekstu i nie naciśnie klawisz `Enter`. Po wpisaniu tekstu i naciśnięciu klawisza `Enter` tekst zostanie przypisany do zmiennej `imie` i wyświetlony na ekranie.

- Wczytywanie innego typu danych
  
- `nextInt()` - wczytuje liczbę całkowitą
- `nextDouble()` - odczytuje kolejną liczbę zmiennoprzecinkową,
- `nextBoolean()` - odczytuje kolejną wartość typu boolean,
- oraz analogiczne metody dla typów byte, short, long, float. Nie istnieje metoda do wczytywania pojedynczego znaku typu char.


Pełną dokumentację znajdziesz tutaj: [Dokumentacja Scanner](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html)

- Czyszczenie strumienia wejścia
  
Jeżeli korzystając ze Scannera na zmianę będziesz wczytywać liczby oraz napisy, to po każdym wczytaniu liczby wywołaj także pustą metodę `nextLine()`. Dzięki temu pozbędziesz się ze strumienia wejścia zbędnego znaku entera, który nie jest konsumowany przez metody `nextInt()`, czy `nextDouble()`.

```java
import java.util.Scanner;

class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int n = scanner.nextInt();
        scanner.nextLine(); //potrzebne, jeśli wczytujemy napis po wczytaniu liczby
        System.out.println("Podaj napis:");
        String w = scanner.nextLine();

        System.out.println(w + " " + n);
    }
}
```
