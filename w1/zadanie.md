<p align="center"><img src="https://user-images.githubusercontent.com/50357817/211667240-a5cc7635-b8ff-4d15-b849-33b43add557c.svg" alt="baner"></p>

# Zadanie do wykonania z wykładu 1

## Przed rozpoczęciem:
- Kliknij gwiazdkę w prawym górnym rogu tego repozytorium
- Kliknij przycisk ```Follow``` naszego [profilu](https://github.com/WebAce-Group) na Githubie

To nie jest konieczne, ale bardzo nam pomaga :)

## Zadanie 0 - Konfiguracja Git-a oraz Githuba
- Utwórz konto na Githubie
- Pobierz i zainstaluj Git-a
- Przeprowadź konfigurację Git-a (nazwa użytkownika, email)
- Zrób ```fork``` tego repozytorium
- Zrób ```clone``` repozytorium na swój komputer (pamiętaj o klonowaniu swojego ```fork```-a):
  
   ```git clone https://github.com/{twoja nazwa użytkownika}/java101-edycja1.git```
-  Utwórz nowy folder o swoim nicku na Githubie w folderze ```w1/zadania```
-  do tego folderu będziesz wrzucać swoje rozwiązania zadań (pliki .java)

## Zadanie 1 - Zmienne i typy danych
- W projekcie utwórz plik ```Zadanie1.java```
  > Uwaga! Nazwa pliku musi być taka sama jak nazwa klasy!
  > W tym przypadku nazwa klasy to ```Zadanie1```
  >
  > W klasie ```Zadanie1``` utwórz metodę ```main```.
  > Plik powinien wyglądać tak:
  > ```java
  >public class Zadanie1 {
  >    public static void main(String[] args) {
  >      // tutaj umieść rozwiązanie zadanie      
  >    }
  > }
  > ```
  > Takie przygotowanie pliku jest konieczne, aby móc uruchomić nasz program i takie przygotowanie pliku będzie konieczne przy każdym kolejnym zadaniu.
- Utwórz 4 zmienne całkowite (typu ```int```) o nazwach: ```a```, ```b```, ```c```, ```d``` i przypisz im wartości: ```1```, ```2```, ```3```, ```4```.
- Utwórz 2 nowe zmienne całkowite (typu ```int```) o nazwach: ```ab```, ```cd```. Wartością ```ab``` ma być suma wartości zmiennych ```a``` i ```b```, a wartością ```cd``` różnica wartości zmiennych ```c``` i ```d```.
- Utwórz 4 zmienne zmiennoprzecinkowe (typu ```double```) o nazwach: ```e```, ```f```, ```g```, ```h``` i przypisz im wartości: ```1.1```, ```2.2```, ```3.3```, ```4.4```.
- Utwórz 2 nowe zmienne zmiennoprzecinkowe (typu ```double```) o nazwach: ```ef```, ```gh```. Wartością ```ef``` ma być wynik mnożenia wartości zmiennych ```e``` i ```f```, a wartością ```gh``` wynik dzielenia wartości zmiennych ```g``` i ```h```.

- Jaka będzie reszta z dzielenia zmiennej ```ab``` przez zmienną ```b```?

- Utwórz 2 zmienne typu ```char``` o nazwach: ```i```, ```j``` i przypisz im wartości: ```'A'```, ```'a'```.
- Sprawdź czy da się dodać do siebie zmienne ```i``` i ```j```. Jeśli nie, to dlaczego? Jeśli tak, to jaka będzie wartość?
- Utwórz 2 zmienne typu ```String``` o nazwach: ```k```, ```l``` i przypisz im wartości: ```"Ala"```, ```"ma"```.
- Sprawdź czy da się dodać do siebie zmienne ```k``` i ```l```. Jeśli nie, to dlaczego? Jeśli tak, to jaka będzie wartość?
- Utwórz 2 zmienne typu ```boolean``` o nazwach: ```m```, ```n``` i przypisz im wartości: ```true```, ```false```.
- Wyświetl w konsoli wartość wyrażenia ```m && n```.
- Wyświetl w konsoli wartość wszystkich zmiennych.

## Zadanie 2 - Funkcje matematyczne
- W projekcie utwórz plik ```Zadanie2.java```
- Utwórz 2 zmienne całkowite (typu ```int```) o nazwach: ```a```, ```b``` i przypisz im wartości: ```5```, ```10```.
- Utwórz 2 zmienne zmiennoprzecinkowe (typu ```double```) o nazwach: ```c```, ```d```.
- Zmiennej ```c``` przypisz wartość ```a``` podniesioną do potęgi ```b``` (stosując odpowiednią metodę z klasy ```java.lang.Math```).
- Zmiennej ```d``` przypisz wartość pierwiastka kwadratowego ```c```(stosując odpowiednią metodę z klasy ```java.lang.Math```).
- Wyświetl w konsoli wartość wszystkich zmiennych.
- Utwórz zmienną całkowitą (typu ```int```) o nazwie: ```e``` i przypisz jej wartość: ```-5```.
- Utwórz 2 zmienne zmiennoprzecinkowe (typu ```double```) o nazwach: ```g```, ```h```.
- Zmiennej ```g``` przypisz wartość bezwględną ```e``` (stosując odpowiednią metodę z klasy ```java.lang.Math```).
- Zmiennej ```h``` przypisz wartość ```10.5001```.
- Teraz, zaokrąglij wartość zmiennej ```h``` do najbliższej liczby całkowitej (stosując odpowiednią metodę z klasy ```java.lang.Math```).
- Wyświetl w konsoli wartość wszystkich zmiennych.

## Wysyłanie rozwiązań
- Dodać pliki ```Zadanie1.java``` i ```Zadanie2.java``` do repozytorium (```git add```).
- Zatwierdzić zmiany (```git commit -m "Rozwiązania zadań z zajęć 1"```).
- Wysłać zmiany na serwer do waszych repozytoriów (```git push```).
- Na stronie GitHuba, w repozytorium, utworzyć nowy pull request do repozytorium kursu - czyli do tego, z którego robiliście ```fork```.
- Czekajcie na sprawdzenie rozwiązań przez prowadzącego - jeśli wszystko jest ok, to pull request zostanie zaakceptowany i wasze rozwiązania pojawią się w repozytorium kursu.
- Jeśli pojawią się jakieś uwagi - do pull requesta zostanie dodany komentarz, a wasze rozwiązania nie zostaną zaakceptowane. W takim przypadku, poprawcie błędy i wysyłajcie ponownie rozwiązania.
- W razie problemów z wysłaniem rozwiązań, proszę o kontakt poprzez adres e-mail: ***adrian.goral@webace-group.dev***
