import java.util.Scanner;

public class Dodatkowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        System.out.println(Spinner.SpinWords(words));
    }
}
