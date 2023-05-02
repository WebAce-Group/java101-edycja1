<p align="center"><img src="https://user-images.githubusercontent.com/50357817/234224002-a98353d5-599d-47e7-9f0c-8119299e5620.svg" alt="baner"></p>

# Szósty wykład Java 101

## Data: **24 kwietnia 2023**

## Miejsce: **Sala D2.2 - C-16 Technopolis - Janiszewskiego 7, 50-372 Wrocław**

## Godzina: **19.00**

___

## Przygotowanie projektu

Tworząc nowy projekt JavaFx, wybieramy opcję tak jak poniżej:

![image](https://cdn.discordapp.com/attachments/713828311796547656/1100170696409223321/image.png)

Oczywiście zmieniając odpowiednio nazwę projektu.

## Zależności i budowanie projektu

> Należy pobrać mavena z [tej strony](https://maven.apache.org/download.cgi) i dodać go do zmiennych środowiskowych.

Musimy utworzyć projekt typu Maven, który będzie zawierał wszystkie potrzebne biblioteki:

`pom.xml`:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId> <!-- Tutaj wpisujemy nazwę naszego projektu / naszej paczki -->   
    <artifactId>[nazwa paczki, którą będziemy eksportować]</artifactId>
    <version>[wersja]</version>
    <name>[nazwa projektu]</name>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <junit.version>5.9.1</junit.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-assembly-plugin</artifactId>
            <version>3.4.2</version>
            <type>maven-plugin</type>
        </dependency>
        <dependency>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
        </dependency>
        <dependency>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-dependency-plugin</artifactId>
            <version>3.3.0</version>
        </dependency>
        <dependency>
            <groupId>org.xerial</groupId>
            <artifactId>sqlite-jdbc</artifactId>
            <version>3.40.1.0</version>
        </dependency>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>19.0.2.1</version>
        </dependency>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-fxml</artifactId>
            <version>19.0.2.1</version>
        </dependency>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-web</artifactId>
            <version>19.0.2.1</version>
        </dependency>
        <dependency>
            <groupId>org.controlsfx</groupId>
            <artifactId>controlsfx</artifactId>
            <version>11.1.2</version>
        </dependency>
        <dependency>
            <groupId>com.dlsc.formsfx</groupId>
            <artifactId>formsfx-core</artifactId>
            <version>11.6.0</version>
            <exclusions>
                <exclusion>
                    <groupId>org.openjfx</groupId>
                    <artifactId>*</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>

    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-dependency-plugin</artifactId>
                <executions>
                    <execution>
                        <id>copy-dependencies</id>
                        <phase>prepare-package</phase>
                        <goals>
                            <goal>copy-dependencies</goal>
                        </goals>
                        <configuration>
                            <outputDirectory>
                                ${project.build.directory}/libs
                            </outputDirectory>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>17</source>
                    <target>17</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.openjfx</groupId>
                <artifactId>javafx-maven-plugin</artifactId>
                <version>0.0.8</version>
                <executions>
                    <execution>
                        <!-- Default configuration for running with: mvn clean javafx:run -->
                        <id>default-cli</id>
                        <configuration>
                            <mainClass>
                                <!-- Ścieżka do bazowej klasy np: -->
                                me.webace.zajecia6/me.webace.zajecia6.SuperStart
                            </mainClass>
                            <launcher>app</launcher>
                            <jlinkZipName>app</jlinkZipName>
                            <jlinkImageName>app</jlinkImageName>
                            <noManPages>true</noManPages>
                            <stripDebug>true</stripDebug>
                            <noHeaderFiles>true</noHeaderFiles>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <artifactId>maven-assembly-plugin</artifactId>
                <executions>
                    <execution>
                        <phase>package</phase>
                        <goals>
                            <goal>single</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <!-- ... -->
                    <archive>
                        <manifest>
                            <!-- Tak jak wyżej, tylko bez początku -->
                            <mainClass>me.webace.zajecia6.SuperStart</mainClass>
                        </manifest>
                    </archive>
                    <descriptorRefs>
                        <!-- Dodatkowy opis paczki z wszystkimi zależnościami -->
                        <descriptorRef>jar-with-dependencies</descriptorRef>
                    </descriptorRefs>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

Tak przygotowany plik `pom.xml` możemy wykorzystać do stworzenia paczki z naszą aplikacją. Wystarczy, że w konsoli wpiszemy polecenie:

`mvn clean package`

Po tym, w folderze projektowym w subfolderze `target` będzie znajdował się jar ze wszystkimi załączonymi zależnościami. Możemy go wykorzystać do uruchomienia naszej aplikacji bez kodu źródłowego.

---

## Struktura projektu

W strukturze projektu znajdują się pliki:

- `pom.xml` - plik konfiguracyjny Mavena
- `src/main/java` - folder z kodem źródłowym:
- - `HelloController.java` - klasa kontrolera dla naszego widoku
- - `HelloApplication.java` - klasa główna naszej aplikacji (no, prawie główna :D)
- - `SuperStart.java` - klasa główna naszej aplikacji - w niej uruchamiamy naszą aplikację (metodę `main` z klasy `HelloApplication.java`)
- `src/main/resources` - folder z plikami zasobów:
- - `hello-view.fxml` - plik z widokiem naszej aplikacji

oraz dodatkowe klasy zbudowane na potrzebę zajęć.

Oczywiście załączam cały wszystkie pliki źródłowe do pobrania.

---

## Krok po kroku

### 1. Co się dzieje w klasie `HelloApplication.java`

W klasie `HelloApplication.java` znajduje się metoda `start`, która jest wywoływana przez metodę `main` z klasy `SuperStart.java`. W tej metodzie tworzymy obiekt klasy `HelloApplication` i wywołujemy metodę `start`.

```java
package me.webace.zajecia6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import me.webace.zajecia6.database.DatabaseController;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        HelloController hello = fxmlLoader.getController();
        hello.createDatabase();
        stage.setTitle("6 wykład z JAVA101!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
```

### 2. Klasa `HelloController.java`

Klasa `HelloController.java` jest kontrolerem dla widoku `hello-view.fxml`. W tej klasie znajduje się metoda `createDatabase`, która tworzy bazę danych. W tym celu wykorzystujemy klasę `DatabaseController.java` - delikatnie zmodyfikowaną od poprzednich zajęć.

```java
package me.webace.zajecia6;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import me.webace.zajecia6.database.DatabaseController;
import me.webace.zajecia6.database.User;

public class HelloController {
    @FXML
    public TextField usernameField;

    @FXML
    public TextField emailField;

    @FXML
    public PasswordField passwordField;

    @FXML
    public Text actionLabel;

    DatabaseController dbController;

    boolean isUserAdded = false;

    public void createDatabase(){
        dbController = new DatabaseController();
    }

    public void handleAddUserClick() {
        String username = usernameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        boolean ifAdded = dbController.addUser(new User(username, email, password));
        if (ifAdded) {
            actionLabel.setText("User added to database");
            isUserAdded = true;
            usernameField.focusedProperty().addListener(focusListener);
            emailField.focusedProperty().addListener(focusListener);
            passwordField.focusedProperty().addListener(focusListener);
        }
    }

    public void clearFields(){
        usernameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        actionLabel.setText("");
    }

    ChangeListener<Boolean> focusListener = ((observableValue, oldValue, newValue) -> {
        if (newValue && isUserAdded){
            clearFields();
            isUserAdded = false;
        }
    });

}
```

Wyjaśnienie:
- `@FXML` - adnotacja, która mówi, że dana zmienna jest powiązana z elementem z pliku `hello-view.fxml`
- metoda `createDatabase` - tworzy obiekt klasy `DatabaseController.java`
- metoda `handleAddUserClick` - metoda wywoływana po kliknięciu przycisku `Add user`. Wywołuje metodę `addUser` z klasy `DatabaseController.java` i w zależności od wyniku wyświetla odpowiedni komunikat.
- - `focusedProperty()` - metoda zwraca obiekt `BooleanProperty`, który jest zmieniany w momencie zmiany focusu na danym elemencie. Na jego podstawie możemy wykonać jakieś akcje (w tym przypadku dodajemy listenera `focusListener`).
- - `focusListener` - listener, który wywołuje metodę `clearFields` po zmianie focusu na polach tekstowych.
- metoda `clearFields` - metoda czyszcząca pola tekstowe i komunikat.
  

### 3. Widok `hello-view.fxml`

W pliku `hello-view.fxml` znajduje się kod widoku naszej aplikacji. W tym pliku znajdują się elementy:

- `TextField` - pole tekstowe
- `PasswordField` - pole tekstowe z ukrytym tekstem
- `Button` - przycisk
- `Text` - tekst
- `Label` - etykieta dla pola tekstowego

Wszystko opakowane jest w `Pane` - w tym przypadku `GridPane` oraz `VBox`.

- `GridPane` - pane, który umożliwia ustawienie elementów w siatce (wiersze i kolumny)
- `VBox` - pane, który umożliwia ustawienie elementów jeden pod drugim
  
```xml
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.layout.GridPane?>
<?import javafx.geometry.Insets?>
<?import javafx.scene.text.Text?>
<?import javafx.scene.control.*?>
<?import javafx.scene.layout.HBox?>
<GridPane fx:controller="me.webace.zajecia6.HelloController" xmlns:fx="http://javafx.com/fxml"
          alignment="center" hgap="10" vgap="10">
    <padding>
        <Insets top="25" right="25" bottom="10" left="25"/>
    </padding>

    <Text text="Welcome"
          GridPane.columnIndex="0" GridPane.rowIndex="0"
          GridPane.columnSpan="2"/>

    <Label  text="Username:"
            GridPane.columnIndex="0" GridPane.rowIndex="1"/>

    <TextField fx:id="usernameField"
               GridPane.columnIndex="1" GridPane.rowIndex="1" />

    <Label  text="Email:"
            GridPane.columnIndex="0" GridPane.rowIndex="2"/>

    <TextField fx:id="emailField"
               GridPane.columnIndex="1" GridPane.rowIndex="2" />

    <Label  text="Password:"
            GridPane.columnIndex="0" GridPane.rowIndex="3"/>

    <PasswordField fx:id="passwordField"
               GridPane.columnIndex="1" GridPane.rowIndex="3" />

    <HBox spacing="10" alignment="bottom_right"
          GridPane.columnIndex="1" GridPane.rowIndex="4">
        <Button text="Enter user"
                onAction="#handleAddUserClick"/>
    </HBox>

    <Text fx:id="actionLabel" fill="darkgreen"
          GridPane.columnIndex="1" GridPane.rowIndex="6"/>
</GridPane>
```
---

## Uruchomienie aplikacji

Aby uruchomić aplikację, uruchamiamy klasę `SuperStart.java`. Po uruchomieniu aplikacji powinniśmy zobaczyć okno z formularzem rejestracyjnym.

## Eksport aplikacji

Aby wyeksportować aplikację do pliku `.jar`, wykonujemy wcześniej podaną komendę:

`mvn clean package`

Po wykonaniu tej komendy w folderze `target` powinien pojawić się plik `zajecia6-1.0-SNAPSHOT+twoj opis.jar`. Ten plik możemy uruchomić na dowolnym komputerze z zainstalowanym Javą (w tej samej wersji, co na komputerze, na którym wykonywaliśmy komendę `mvn clean package`).

> Oczywiste jest, że nazwa pliku może się różnić w zależności od konfiguracji projektu.


## Zadanie dla chętnych i ambitnych (nieobowiązkowe)

- Dodaj nowy widok do aplikacji, który będzie zawierał tabelę z listą użytkowników. Tabela powinna być zbudowana na podstawie danych z bazy danych. 
- Do głównego widoku aplikacji dodaj przycisk, który po kliknięciu zmieni scenę na widok z tabelą (inny plik `fxml`)
- Do widoku z tabelą dodaj przycisk, który po kliknięciu zmieni scenę na widok z formularzem 
