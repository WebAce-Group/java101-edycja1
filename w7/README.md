<p align="center"><img src="https://user-images.githubusercontent.com/50357817/236595771-126211ca-bc62-4f01-8204-7908267adefc.svg" alt="baner"></p>

# **Ostatni** wykład Java 101

## Data: **8 maja 2023**

## Miejsce: **Sala D2.2 - C-16 Technopolis - Janiszewskiego 7, 50-372 Wrocław**

## Godzina: **19.00**

___


# Podstawowe pojęcia związane z tymi zajęciami

## Spring Boot

Spring Boot to framework do tworzenia aplikacji w języku Java. Framework ten jest oparty na platformie Spring i umożliwia tworzenie aplikacji webowych, mikrousług i innych typów aplikacji. Spring Boot zapewnia łatwą konfigurację i wdrażanie aplikacji, a także obsługę wielu popularnych bibliotek i narzędzi.

## JPA i Hibernate

JPA (Java Persistence API) to interfejs programowania aplikacji (API), który umożliwia programistom łatwe korzystanie z bazy danych w aplikacjach napisanych w języku Java. Dzięki JPA, możemy pisać kod, który pozwala na łatwe dodawanie, modyfikowanie, usuwanie i pobieranie danych z bazy danych, tak jakbyśmy operowali na zwykłych obiektach w pamięci.

Hibernate to biblioteka, która implementuje JPA i umożliwia łatwe korzystanie z JPA w naszych aplikacjach. Hibernate jest tzw. frameworkiem ORM (Object-Relational Mapping), co oznacza, że pozwala nam mapować (przekształcać) obiekty w pamięci na rekordy w bazie danych i odwrotnie.

Innymi słowy, Hibernate umożliwia nam zapisywanie obiektów z języka Java do bazy danych oraz pobieranie ich z powrotem z bazy danych w postaci obiektów. Dzięki temu możemy używać obiektów w naszym kodzie zamiast operować bezpośrednio na bazie danych.

Na przykład, jeśli mamy obiekt reprezentujący użytkownika w naszej aplikacji, możemy użyć Hibernate, aby zapisać ten obiekt w bazie danych. Hibernate automatycznie utworzy rekord w bazie danych, który odpowiada temu obiektowi, a następnie przypisze ten rekord do naszego obiektu. W ten sposób możemy łatwo zapisywać i pobierać dane z bazy danych w naszej aplikacji.

Podsumowując, JPA i Hibernate to narzędzia, które pozwalają nam łatwo korzystać z bazy danych w naszych aplikacjach. Dzięki nim możemy operować na danych z bazy danych tak, jakby były one zwykłymi obiektami w naszej aplikacji. To pozwala na łatwiejsze i bardziej intuicyjne programowanie, a także na bardziej efektywne korzystanie z bazy danych.

## Bean w Spring Boot

Bean w Springu to po prostu obiekt, który jest zarządzany przez kontener IoC (Inversion of Control). Innymi słowy, jest to obiekt, którego cykl życia jest kontrolowany przez Springa i którego instancja jest tworzona, zarządzana i zniszczana przez kontener IoC.

W Springu możemy spotkać wiele rodzajów Beanów, takich jak:

- Singleton - Jest to Bean, który jest tworzony tylko raz podczas uruchamiania aplikacji i jest udostępniany dla wszystkich komponentów, które go wykorzystują. Oznacza to, że każde wywołanie metody na tym samym Singletonie zwróci tę samą instancję obiektu.

- Prototype - Jest to Bean, który jest tworzony za każdym razem, gdy jest potrzebny, tzn. dla każdego wywołania zostanie utworzona nowa instancja obiektu.

- Request - Jest to Bean, który jest tworzony dla każdego żądania HTTP i jest dostępny tylko w ramach tego żądania. Oznacza to, że każde wywołanie metody na tym samym Request Beanie zwróci tę samą instancję obiektu tylko w ramach tego samego żądania HTTP.

- Session - Jest to Bean, który jest tworzony dla każdej sesji użytkownika i jest dostępny tylko w ramach tej sesji. Oznacza to, że każde wywołanie metody na tym samym Session Beanie zwróci tę samą instancję obiektu tylko w ramach tej samej sesji użytkownika.

- Global - Jest to Bean, który jest dostępny w całej aplikacji i jest tworzony tylko raz podczas uruchamiania aplikacji. Oznacza to, że każde wywołanie metody na tym samym Global Beanie zwróci tę samą instancję obiektu.

W Springu możemy tworzyć i konfigurować własne Beany, które będą spełniały nasze potrzeby w aplikacji. Dzięki temu możemy w prosty sposób zarządzać zależnościami między różnymi komponentami w aplikacji i uniknąć powtarzalnego kodu.

## Dependency Injection

Dependency Injection to technika programowania, która pomaga programistom tworzyć aplikacje, które są łatwiejsze do zrozumienia, modyfikacji i testowania. Aby zrozumieć Dependency Injection, musimy najpierw zrozumieć, co to jest zależność.

Zależność oznacza, że nasza aplikacja potrzebuje czegoś innego, aby działać. Na przykład, nasza aplikacja może potrzebować połączenia do bazy danych, aby zapisać lub odczytać dane. Aby uzyskać to połączenie, musimy utworzyć obiekt, który reprezentuje połączenie do bazy danych.

Dependency Injection polega na tym, że zamiast tworzyć ten obiekt wewnątrz naszej aplikacji, zostaje on dostarczony z zewnątrz. Innymi słowy, ktoś inny tworzy obiekt, a nasza aplikacja po prostu go otrzymuje. To jest jak dostawa jedzenia - nie musimy gotować, ponieważ ktoś inny gotuje za nas, a my po prostu odbieramy jedzenie.

Dzięki temu, że obiekt jest dostarczany z zewnątrz, nasza aplikacja staje się bardziej elastyczna i łatwiejsza do modyfikacji. Na przykład, jeśli chcemy zmienić sposób, w jaki uzyskujemy połączenie do bazy danych, nie musimy zmieniać naszej aplikacji. Wystarczy zmienić sposób, w jaki obiekt jest tworzony i dostarczany do naszej aplikacji.

W Spring Boot Dependency Injection jest zaimplementowany przy pomocy kontekstu aplikacji. Kontekst aplikacji to miejsce, w którym przechowywane są obiekty, których potrzebuje nasza aplikacja. Kontekst aplikacji może również dostarczać te obiekty do naszej aplikacji, dzięki czemu nie musimy ich sami tworzyć.

Na przykład, gdy nasza aplikacja potrzebuje połączenia do bazy danych, możemy poprosić kontekst aplikacji o dostarczenie tego połączenia. Kontekst aplikacji znajdzie odpowiedni obiekt, który reprezentuje połączenie do bazy danych, utworzy go, jeśli jeszcze nie istnieje, a następnie przekaże go do naszej aplikacji. W ten sposób nasza aplikacja korzysta z Dependency Injection, aby uzyskać połączenie do bazy danych bez konieczności tworzenia go samodzielnie.

## Inversion of Control

Inversion of Control (IoC) to koncepcja, która jest związana z Dependency Injection (DI) i oznacza przekazanie kontroli nad wykonywaniem programu od programisty do frameworka lub kontenera. Oznacza to, że nie to aplikacja decyduje, jakie obiekty powinny być utworzone i w jaki sposób powinny być połączone, lecz to framework lub kontener wstrzykiwania zależności decydują, które obiekty są potrzebne i jak mają być ze sobą powiązane.

W przypadku frameworka Spring, IoC odnosi się do sposobu, w jaki Spring zarządza cyklem życia obiektów i ich zależnościami. Spring tworzy obiekty, a następnie wstrzykuje w nie zależności, co oznacza, że programista nie musi ręcznie tworzyć obiektów i ich zależności, a zamiast tego może skoncentrować się na implementacji logiki biznesowej.

IoC umożliwia programistom tworzenie aplikacji, które są mniej zależne od infrastruktury i frameworków, co zwiększa elastyczność i modularność. Programiści nie muszą znać wszystkich szczegółów technicznych implementacji, co pozwala na szybsze tworzenie i utrzymywanie aplikacji.

IoC i DI są ściśle ze sobą powiązane i często używane są zamiennie. IoC to ogólna koncepcja, która odnosi się do przekazania kontroli nad wykonywaniem programu do zewnętrznego agenta, podczas gdy DI to konkretna implementacja IoC, która polega na wstrzykiwaniu zależności do klas w celu odseparowania kodu od zależności i zwiększenia elastyczności aplikacji.

## REST API

REST to skrót od angielskiego terminu Representational State Transfer. Jest to architektura oprogramowania, która definiuje zasady projektowania interfejsów programowania aplikacji (API) dla systemów rozproszonych, takich jak aplikacje webowe lub mobilne. REST zakłada, że każda jednostka funkcjonalna w systemie powinna być traktowana jako zasób i powinna mieć swój unikalny identyfikator (URI).

Podstawowe zasady architektury REST to:

- Zasoby (Resources) - Każdy element systemu powinien być traktowany jako zasób, czyli pojedyncza jednostka funkcjonalna, która może być dostępna poprzez swój unikalny identyfikator URI.

- Rezprezentacja (Representation) - Każdy zasób powinien mieć jedną lub więcej reprezentacji, które określają sposób, w jaki zasób jest przekazywany do klienta. Reprezentacja może być w różnych formatach, takich jak JSON, XML lub HTML.

- Protokół (Protocol) - REST wykorzystuje standardowe protokoły sieciowe, takie jak HTTP, do przesyłania informacji między klientem a serwerem.

- Bezstanowość (Statelessness) - Każde żądanie HTTP musi zawierać wystarczającą ilość informacji, aby serwer mógł zrozumieć, co klient chce zrobić. Serwer nie przechowuje żadnych informacji o stanie klienta między żądaniami.

- Jednoznaczność interfejsu (Uniform Interface) - Interfejs powinien być jednoznaczny, czyli każdy zasób powinien mieć jednoznaczny identyfikator URI oraz powinien być udostępniony w określonym formacie reprezentacji.

REST API opiera się na idei zasobów, które są dostępne poprzez unikalne URI (Uniform Resource Identifier). Każdy zasób może mieć wiele reprezentacji w różnych formatach, takich jak XML, JSON czy HTML. Klient aplikacji może żądać konkretnej reprezentacji zasobu poprzez ustawienie nagłówka Accept.

REST API definiuje też zestaw operacji, które można wykonywać na zasobach. Najczęściej używanymi operacjami są:

- `GET` - odczytanie zasobu lub listy zasobów,
- `POST` - utworzenie nowego zasobu,
- `PUT` - aktualizacja istniejącego zasobu,
- `DELETE` - usunięcie zasobu.

REST API może także definiować inne operacje, takie jak `HEAD`, `OPTIONS` czy `PATCH`. Zależnie od potrzeb, REST API może wymagać uwierzytelnienia i autoryzacji, aby zapewnić bezpieczeństwo danych.

REST API są często stosowane w aplikacjach webowych i mobilnych, ponieważ umożliwiają łatwe i bezpieczne udostępnianie danych między różnymi aplikacjami. Dzięki temu, można szybko i łatwo integrować różne systemy i aplikacje. Istnieje wiele narzędzi i bibliotek, takich jak Spring Boot, Django, czy Flask, które ułatwiają tworzenie REST API w aplikacjach webowych i mobilnych.

## CRUD

CRUD to skrót od angielskich słów Create, Read, Update i Delete, co w tłumaczeniu na język polski oznacza Tworzenie, Odczyt, Aktualizacja i Usuwanie. CRUD to podstawowe operacje, które można wykonać na danych w bazie danych lub innym systemie przechowywania danych.

Konkretnie, operacje CRUD to:

+ Create (Tworzenie) - Utworzenie nowego rekordu w bazie danych lub innym systemie przechowywania danych.
+ Read (Odczyt) - Odczytanie istniejącego rekordu z bazy danych lub innego systemu przechowywania danych.
+ Update (Aktualizacja) - Aktualizacja istniejącego rekordu w bazie danych lub innym systemie przechowywania danych.
+ Delete (Usuwanie) - Usunięcie istniejącego rekordu z bazy danych lub innego systemu przechowywania danych.

Operacje CRUD są bardzo powszechne w tworzeniu aplikacji, ponieważ pozwalają na manipulowanie danymi w bazie danych lub innym systemie przechowywania danych. Wiele frameworków i bibliotek, takich jak Spring, Hibernate czy Django, dostarcza gotowe narzędzia i mechanizmy, które ułatwiają wykonywanie operacji CRUD w aplikacjach webowych lub desktopowych. Dzięki temu programiści mogą skupić się na logice biznesowej aplikacji, a nie na manipulowaniu danymi w bazie danych.
