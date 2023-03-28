import java.lang.Math;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


class Zadania {

    public static int getIntFromStdIn(Scanner scanner) {
        int output = 0;
        boolean assigned = false;
        while (!assigned) {
            if (scanner.hasNextInt()) {
                assigned = true;
                output = scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("Należy podać liczbę całkowitą");
            }
        }
        return output;
    }

    public static void setArrayFromStdIn(int [] array, Scanner scanner) {
        System.out.println("Podaj " + array.length + " liczb całkowitych.");
        for (short i = 0; i < array.length; i++)
            array[i] = getIntFromStdIn(scanner);
    }
 

    // Zadanie 9 - Tablice jednowymiarowe
    public static void zad9(Scanner scanner) {
        int[] array_1 = new int[10];
        setArrayFromStdIn(array_1, scanner);

        short i = 0;
        for (int num : array_1) {
            System.out.print(Math.pow(num, i) + " ");
            i++;
        }
        System.out.print("\n");
    }


    // Zadanie 10 - Tablice wielowymiarowe
    public static void zad10(Scanner scanner) {
        int w;
        int k;

        // set w
        do {
            System.out.println("Podaj ilość wierszy");
            w = getIntFromStdIn(scanner);
        } while (w <= 0);

        // set k
        do {
            System.out.println("Podaj ilość kolumn");
            k = getIntFromStdIn(scanner);
        } while (k <= 0);

        int[][] matrix = new int[w][k];

        int w_local;
        int k_local;
        for (int i = 0; i < w*k; i++) {
            w_local = i/k; // w_loc gets +1 after each filled row
            k_local = i%k; // going from [0] to [k-1] (last collumn)
            matrix[w_local][k_local] = i+1;
        }

        System.out.println("\nMacierz A_(w x k)");
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }

        System.out.println("\nMacierz A^T");
        // jak próbowałem to zrobić xD
        // for (int j = 0; j < k; j++) {
        //     for (int i = j; i/k < w; i+=k) {
        //         w_local = i/k;
        //         k_local = i%k;
        //         if (w_local == w-1 ) {
        //             System.out.print(matrix[w_local][k_local] + "\n");
        //         } else {
        //             System.out.print(matrix[w_local][k_local] + " ");
        //         }
        //     }
        // }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < w; j++)
                System.out.print(matrix[j][i] + " ");
            System.out.print("\n");
        }
    }

    // Zadanie 11 - Klasa `Arrays`
    public static void zad11(Scanner scanner) {
        int[] foo = new int[10];
        int[] bar = new int[10];
        Arrays.fill(foo, 0);
        setArrayFromStdIn(bar, scanner);
        Arrays.sort(foo); // sorting only 0s
        Arrays.sort(bar);
        System.out.println("i foo bar");
        for (int i = 0; i < 10; i++)
            System.out.println(i + ". " + foo[i] + ", " + bar[i]);

    }

    // Zadanie 12 - `ArrayList`
    public static void zad12(Scanner scanner) {
        ArrayList<String> names = new ArrayList<String>();
        //adding names
        names.add("Anna");
        names.add("Alex");
        names.add("Anastazja");
        names.add("Antoni");
        names.add("Aleksandra");
        names.add("Alojzy");
        names.add("Atena");
        names.add("Ananiasz");
        names.add("Amelia");
        names.add("Arkadiusz");
        System.out.println("Przed posortowaniem");
        System.out.println(names.toString());
        System.out.println("");
        Collections.sort(names);
        names.remove(0); // rm 1st name
        // formating output
        String output = "[";
        for (String name : names)
            output += (name + ", ");
        output += "]";
        output.replace(", ]", "]");
        // printing output
        System.out.println("Po sortowaniu");
        System.out.println(output);
    }


    /** 
     * Func reads from file like "<question>\n<answer>\n\n<question>\n..." to map[<question>]=<answer>
     */
    public static void readFileToMap(Map<String, Integer> map_loc) {
        String question = "foo";
        Integer answer = 0;
        try {
            File trivia = new File("trivia.txt");
            Scanner reader = new Scanner(trivia);
            for (int i = 0; reader.hasNextLine(); i=(i+1)%3) {
                if (i == 0) // read line w question
                    question = reader.nextLine();
                else if (i == 1) { // read line w answer and add Q&A to map
                    answer = reader.nextInt();
                    map_loc.put(question, answer);
                }
                else { // clear after nextInt and reading \n between Questions
                    reader.nextLine();
                    reader.nextLine();
                }
             }
             reader.close(); // close file read
        } catch (FileNotFoundException e) {
            System.out.println("File with questions not found");
            System.out.println("(it should be in /zadania/Kasper3120/)");
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            System.out.println("Readed new line without new line");
            e.printStackTrace();
        }
        
    }
    /**
     * Func starts one game of trivia 
     * Parameters:
     * Map<String, Integer> questions - map[question]=answer
     * Scanner scanner - stdin scanner
     */
    public static void game(Map<String, Integer> questions, Scanner scanner){
        double points = 0;
        int answer;
        for (Map.Entry<String, Integer> pair : questions.entrySet()) {
            System.out.println(pair.getKey());
            answer = getIntFromStdIn(scanner);
            if (answer == pair.getValue()) { points++; }
        }
        // marking test
        points/=questions.size();
        System.out.print("Ocena: ");
        if (points > 0.95) { System.out.println("6"); }
        else if (points > 0.85) { System.out.println("5"); }
        else if (points > 0.75) { System.out.println("4"); }
        else if (points > 0.65) { System.out.println("3"); }
        else if (points > 0.55) { System.out.println("2"); }
        else { System.out.println("1"); }
    }
    // Zadanie 13 - Gra typu trivia
    public static void zad13(Scanner scanner) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        readFileToMap(map);
        while (true) {
            game(map, scanner);
            System.out.println("Zagrać ponownie? 1 - tak 0 - nie");
            int choice = getIntFromStdIn(scanner);
            if (choice == 0) { break; }
        }
    }

    public static void zad14(Scanner scanner) {
        String result;
        scanner.nextLine();
        Spinner spin = new Spinner();
        do {
            System.out.println("Podaj ciąg słów. 0 - wyjście");
            String input = scanner.nextLine();
            result = spin.spinWords(input);
            System.out.println(result);
        } while (!result.contains("0"));
        
    }


    /**
     * function generates command line menu that lets user choose one excercise or all excercises-> true or quit menu-> false
     * if wrong number is given -> true
     **/
    public static boolean mainMenu(int num, Scanner scanner) {
        switch (num) {
            case 9:
                zad9(scanner);
                break;
            case 10:
                zad10(scanner);
                break;
            case 11:
                zad11(scanner);
                break;
            case 12:
                zad12(scanner);
                break;
            case 13:
                zad13(scanner);
                break;
            case 14:
                zad14(scanner);
                break;
            case 1:
                zad9(scanner);
                zad10(scanner);
                zad11(scanner);
                zad12(scanner);
                zad13(scanner);
                zad14(scanner);
                break;
            case 0:
                return false;
            default:
                System.out.println("Zły numer.");
                break;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;

        //print menu and use func mainMenu to get users choice, set cont (while condition) = mainMenu_return_value
        while (cont) {
            System.out.println("Wybierz zadanie: (9, 10, 11, 12, 13, 14 lub 1 - wszystkie zadania, lub 0 - wyjście)");
            int num = getIntFromStdIn(scanner);
            cont = mainMenu(num, scanner);
        }
        //clean up
        scanner.close();
    }
}
