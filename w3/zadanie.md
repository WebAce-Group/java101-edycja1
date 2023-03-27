# Zadania do wykonania z wykładu 3

## Zadanie 9 - Tablice jednowymiarowe

Napisz program, który:
- utworzy tablicę 10 elementową typu `int`
- pobierze od użytkownika 10 liczb i zapisze je w tablicy
- dla każdego elementu tablicy wyświetli jego 
wartość podniesioną do potęgi jego indeksu

## Zadanie 10 - Tablice wielowymiarowe

Napisz program, który:
- pobierze od użytkownika liczbę 'w' i 'k' (wiersze i kolumny)
- przy użyciu pętli `for` uzupełnij tablicę dwuwymiarową o wymiarach `w`x`k` liczbami od 1 do `w`x`k`
- wyświetli macierz
- wyświetli macierz transponowaną do macierzy z poprzedniego punktu

## Zadanie 11 - Klasa `Arrays`

Napisz program, który:
- utworzy tablicę 10 elementową typu `int`
- uzupełni ją samymi zerami (użyj metody `fill()`)
- utwórz drugą tablicę 10 elementową typu `int`
- pobierz od użytkownika 10 liczb i zapisz je w drugiej tablicy
- posortuj obie tablice (użyj metody `sort()`)

## Zadanie 12 - `ArrayList`

Napisz program, który:
- utworzy obiekt typu `ArrayList` przechowujący obiekty typu `String`
- dodaj do listy 10 elementów (zakładamy, że użytkownik podał 10 imion)
- posortuj listę (użyj metody `sort()`)
- usuń z listy pierwszą pozycję(użyj metody `remove()`)
- wyświetl pozostałe elementy listy (użyj pętli `for-each`)
  
## Zadanie 13 - Gra typu trivia

- Utwórz obiekty typu `Map` o dwóch parametrach typu `String` i `Integer`.
- Wypełnij obiekty danymi, przepisując pytania z pliku `trivia.txt`.
- Przygotuj funkcjonalność, która sprawi, że użytkownik będzie mógł zagrać ponownie
- Przy użyciu pętli `for-each` wyświetl pytania i pobierz odpowiedzi od użytkownika.
- Jeśli użytkownik poda poprawną odpowiedź, dodaj do wyniku 1 punkt.
- Po zakończeniu wszystkich pytań wyświetl jaką ocenę dostał użytkownik (`if else`).
(> 95% - ocena 6, 85% - ocena 5, 75% - ocena 4, 65% - ocena 3, 55% - ocena 2, < 55% - ocena 1)

## Zadanie Dodatkowe - Nieobowiązkowe

Utwórz klasę o nazwie `Spinner`.

Napisz funkcję `SpinWords`, która pobiera ciąg składający się z jednego lub więcej słów i zwraca ten sam ciąg, 
ale z odwróconymi wszystkimi wyrazami, które mają pięć lub więcej liter. Przekazane ciągi będą składać się tylko z liter i spacji. 
Spacje zostaną uwzględnione tylko wtedy, gdy występuje więcej niż jedno słowo.

Przykłady:
- spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
- spinWords( "This is a test") => returns "This is a test" 
- spinWords( "This is another test" )=> returns "This is rehtona test"
