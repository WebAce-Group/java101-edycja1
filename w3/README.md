<p align="center"><img src="https://user-images.githubusercontent.com/50357817/225108795-903963e4-775c-4fa7-8a19-a13bed81fb9c.svg" alt="baner"></p>



# Trzeci wykład Java 101

## Data: **13 marca 2023**

## Miejsce: **Sala D2.2 - C-16 Technopolis - Janiszewskiego 7, 50-372 Wrocław**

## Godzina: **19.00**
___

## Tablice jednowymiarowe

Tablice jednowymiarowe to zbiór elementów o tym samym typie, które są przechowywane w pamięci komputera w sposób uporządkowany. 
Każdy element tablicy ma swój unikalny indeks, który jest liczbą całkowitą. Indeksy tablic zaczynają się od 0. 
Dostęp do elementów tablicy odbywa się poprzez podanie indeksu w nawiasach kwadratowych. Nie można przekroczyć ani 
zmieniać rozmiaru tablicy.


```java
int[] tablica = new int[5];
tablica[0] = 1;
tablica[1] = 2;
tablica[2] = 3;
tablica[3] = 4;
tablica[4] = 5;
```

## Tablice wielowymiarowe

Tablice wielowymiarowe to tablice, które zawierają inne tablice. Tablice wielowymiarowe mogą mieć dowolną liczbę wymiarów, ale muszą
być tego samego typu. Dostęp do elementów tablicy wielowymiarowej odbywa się poprzez podanie indeksów w nawiasach kwadratowych.

```java
int[][] tablica = new int[5][5];
tablica[0][0] = 1;
tablica[0][1] = 2;
...
tablica[4][4] = 25;
```

## Klasa `Arrays`

Klasa `Arrays` zawiera wiele przydatnych metod do zarządzania tablicami. Wiele z nich jest statycznych, więc nie musimy tworzyć obiektu
klasy `Arrays` aby je wywołać. Metody tej klasy to:

- `sort()` - sortuje tablicę używając implementacji sortowania szybkiego (quicksort)
- `binarySearch()` - wyszukuje element o podanym indeksie w tablicy, za pomocą algorytmu wyszukiwania binarnego
- `fill()` - wypełnia tablicę daną wartością
- `equals()` - porównuje dwie tablice dowolnych typów

Przykłady użycia:

```java
int[] tablica = new int[5];
Array.fill(tablica, 0); // wypełnia tablicę zerami
Array.sort(tablica); // sortuje tablicę
Array.binarySearch(tablica, 3); // wyszukuje element o indeksie 3 w tablicy
```


## Array lists (listy dynamiczne)

W odróżnieniu od tablic, array listy mogą zmieniać swój rozmiar. Array listy są obiektami, które przechowują elementy w kolekcji.
Listy dynamiczne są bardzo przydatne, gdy nie wiemy ile elementów będzie w tablicy. Array listy są obiektami, więc aby utworzyć
listę dynamiczną, należy najpierw utworzyć obiekt tej klasy.

```java
ArrayList<Integer> lista = new ArrayList<Integer>();
lista.add(1);
lista.add(2);
lista.add(3);
lista.add(4);
...
lista.add(100);
```

Dodatkowo, oprócz dodawania mamy też wiele innych metod do zarządzania elementami listy dynamicznej, np:

```java
lista.remove(0); // usuwa element o indeksie 0
lista.remove(Integer.valueOf(1)); // usuwa pierwsze wystąpienie elementu o wartości 1
lista.get(0); // zwraca element o indeksie 0
lista.size(); // zwraca rozmiar listy
```

## Mapy (obiekty typu klucz-wartość)

Mapy są obiektami, które przechowują elementy w kolekcji. Mapy przechowują elementy w postaci klucz-wartość. Klucz jest unikalny
i nie może się powtarzać. Wartość może się powtarzać. Wykorzystamy je np.: do przechowywania cen produktów w sklepie internetowym.

```java
Map<String, Integer> mapa = new HashMap<String, Integer>();
mapa.put("jabłko", 2);
mapa.put("gruszka", 3);
mapa.put("banan", 4);
mapa.put("pomarańcza", 5);
```

Oprócz dodawania mamy też wiele innych metod do zarządzania elementami mapy, np:

```java
mapa.remove("jabłko"); // usuwa element o kluczu "jabłko"
mapa.get("gruszka"); // zwraca wartość elementu o kluczu "gruszka"
mapa.size(); // zwraca rozmiar mapy
mapa.isEmpty(); // zwraca true, jeśli mapa jest pusta
mapa.keySet(); // zwraca zbiór kluczy
mapa.values(); // zwraca zbiór wartości
```

## Sets (kolekcje bez duplikatów)

Sets są obiektami podobnymi do list dynamicznych, ale w przeciwieństwie do nich, nie mogą zawierać duplikatów. Sets są bardzo
przydatne, gdy chcemy przechowywać unikalne elementy.

```java
Set<String> set = new HashSet<String>();
set.add("jabłko");
set.add("gruszka");
set.add("banan");
```

Oprócz dodawania mamy też wiele innych metod do zarządzania elementami setu, np:

```java
set.remove("jabłko"); // usuwa element "jabłko"
set.size(); // zwraca rozmiar setu
set.isEmpty(); // zwraca true, jeśli set jest pusty
set.contains("gruszka"); // zwraca true, jeśli set zawiera element "gruszka"
```

## Metoda sprawdzająca czy liczba jest liczbą narcystyczną (kod pisany na zajęciach):
```java
public class Main {
    static boolean czyNarcystyczna(int n){
        String liczba = String.valueOf(n);
        char[] digits = liczba.toCharArray();
        int dlugosc = digits.length;

        int suma = 0;
        for (char c : digits){
            int l = Integer.parseInt(String.valueOf(c));
            suma += Math.pow(l, dlugosc);
        }
        return suma == n ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(czyNarcystyczna(150));
        System.out.println(czyNarcystyczna(2137));
        System.out.println(czyNarcystyczna(2));
        System.out.println(czyNarcystyczna(1));
        System.out.println(czyNarcystyczna(42069));
    }
}
```

## [Zadania do wykoniania](zadanie.md)
