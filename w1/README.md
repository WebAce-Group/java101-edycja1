<p align="center"><img src="https://user-images.githubusercontent.com/50357817/212973047-a3155f5b-d57b-4eac-8d52-4d5367a33efb.svg" alt="baner"></p>

# Pierwszy wykład Java 101

## Data: **13 lutego 2023**

## Miejsce: **Sala D2.1 - C-16 Technopolis - Janiszewskiego 7, 50-372 Wrocław**

## Godzina: **19.00**
___

### **_Instalacja środowiska programistycznego_** [Instalka](https://download.jetbrains.com/idea/ideaIC-2022.3.1.exe)

### **_konfiguracja środowiska Java_** [Instalka](https://download.oracle.com/java/19/latest/jdk-19_windows-x64_bin.msi)

### **_podstawy pracy z Git-em oraz Githubem_** [Instalka Git](https://github.com/git-for-windows/git/releases/download/v2.39.0.windows.2/Git-2.39.0.2-64-bit.exe)

```sh
# konfiguracja globalna użytkownika
git config --global user.name "Twoje imię i nazwisko"
git config --global user.email "Twój email"
```

### **_Typy danych i zmienne_**

Proces tworzenia zmiennej możemy podzielić na dwa etapy:

- Deklaracja zmiennej - tutaj określamy typ i nazwę zmiennej
- Inicjalizacja zmiennej - (nazywana też często inicjacją) - nadanie wartości zmiennej

Schemat definiowania zmiennej jest następujący:

`typ nazwaZmiennej = wartość;`

np.:

```java
int liczba1 = 10;
int liczba2 = liczba1 + 5;
System.out.println(liczba2); //15
liczba2 = 10;
System.out.println(liczba2); //10

double liczba3, liczba4;
liczba3 = 3.5;
liczba4 = 2.5;
System.out.println(liczba3 + liczba4); // 6.0
```

**Zmienne finalne**

Zmienne możesz poprzedzić słowem kluczowym final. Zadeklarowana w ten sposób zmienna może być tylko raz (w dowolnym miejscu) zainicjowana i będzie się nazywała zmienną finalną. Próba przypisania do niej wartości po raz drugi zakończy się błędem i program nawet (na szczęście) nie przejdzie kompilacji.

```java
final double pi=3.14;
final int finalna;
finalna=101;  // tak można zrobić - pierwsze przypisanie
pi=8;         //błąd, zmienna była zainicjowana
```

### **_Operatory matematyczne i logiczne_**

Załóżmy istnienie takich zmiennych:

```java
int a = 5;
int b = 2;
boolean flag = true;
```

- **Operatory matematyczne**
  - **+** dodawanie
  - **-** odejmowanie
  - **\*** mnożenie
  - **/** dzielenie
  - **%** modulo (reszta z dzielenia)
  - **++** inkrementacja (zwiększenie wartości zmiennej o 1)
  - **--** dekrementacja (zmniejszenie wartości zmiennej o 1)
  - **+=** dodawanie i przypisanie
  - **-=** odejmowanie i przypisanie
  - **\*=** mnożenie i przypisanie
  - **/=** dzielenie i przypisanie
  - **%=** modulo i przypisanie

```java
System.out.println("a + b = " + (a + b)); // 7
System.out.println("a - b = " + (a - b)); // 3
System.out.println("a * b = " + (a * b)); // 10
System.out.println("a / b = " + (a / b)); // 2
System.out.println("a % b = " + (a % b)); // 1
System.out.println("Wartość a: " + a); // 5
a++;
System.out.println("Po wykonaniu a++ = " + (a)); // 6
a--;
System.out.println("Po wykonaniu a-- = " + (a)); // 5
int c = a += b;
System.out.println("a += b = " + c); // 7
int d = a -= b;
System.out.println("a -= b = " + d); // 5
int e = a *= b;
System.out.println("a *= b = " + e); // 10
int f = a /= b;
System.out.println("a /= b = " + f); // 5
int g = a %= b;
System.out.println("a %= b = " + g); // 1
```

- **Operatory logiczne**
  - **==** porównanie wartości
  - **!=** porównanie wartości
  - **>** większe
  - **<** mniejsze
  - **>=** większe lub równe
  - **<=** mniejsze lub równe
  - **&&** i
  - **||** lub
  - **!** negacja
```java
System.out.println("a == b = " + (a == b)); // false
System.out.println("a != b = " + (a != b)); // true
System.out.println("a > b = " + (a > b)); // true
System.out.println("a < b = " + (a < b)); // false
System.out.println("a >= b = " + (a >= b)); // true
System.out.println("a <= b = " + (a <= b)); // false
System.out.println("a && b = " + (a > b && a < b)); // false
System.out.println("a || b = " + (a > b || a < b)); // true
System.out.println("!flag = " + (!flag));
```

### **_Funkcje matematyczne_**

W Javie mamy dostęp do kilku funkcji matematycznych, które możemy wykorzystać w naszym programie. Wszystkie te funkcje znajdują się w klasie Math. W celu ich wykorzystania musimy najpierw zaimportować klasę Math.

```java
import static java.lang.Math.*;
```

Następnie możemy wykorzystać funkcje z tej klasy. Poniżej znajduje się lista niektórych funkcji matematycznych, które możemy wykorzystać w naszym programie.

```java
System.out.println("abs(-5) = " + abs(-5)); // 5 - wartość bezwzględna
System.out.println("ceil(5.2) = " + ceil(5.2)); // 6 - zaokrąglenie w górę
System.out.println("floor(5.2) = " + floor(5.2)); // 5 - zaokrąglenie w dół
System.out.println("max(5, 2) = " + max(5, 2)); // 5 - zwraca większą z dwóch liczb
System.out.println("min(5, 2) = " + min(5, 2)); // 2 - zwraca mniejszą z dwóch liczb
System.out.println("pow(5, 2) = " + pow(5, 2)); // 25 - potęgowanie
System.out.println("sqrt(25) = " + sqrt(25)); // 5 - pierwiastek kwadratowy
System.out.println("round(5.2) = " + round(5.2)); // 5 - zaokrąglenie do najbliższej liczby całkowitej
System.out.println("round(5.5) = " + round(5.5)); // 6 - zaokrąglenie do najbliższej liczby całkowitej
```
## [Zadania do wykoniania](zadanie.md)
