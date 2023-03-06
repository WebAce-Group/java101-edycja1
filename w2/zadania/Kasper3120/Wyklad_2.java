import java.util.Scanner;

class Wyklad_2 {

    /**
     * func conversts string to int using parseInt - if NumberFormatException raised -> Integer.MIN_VALUE; else -> int 
     **/
    public static int stoi(String input) {
        int output;
        try {
            output = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Należy podać liczbę całkowitą!");
            System.err.println(e);
            System.out.println();
            output = Integer.MIN_VALUE;
        }
        return output;
    }

    public static void zad3(Scanner scanner) {

        //take int from stdin; if !int -> return;
        System.out.println("Zadanie 3: boki trójkąta");
        System.out.println("Podaj bok a.");
        String aIn = scanner.nextLine();
        int a = stoi(aIn);
        if (a == Integer.MIN_VALUE) {return;}

        System.out.println("Podaj bok b.");
        String bIn = scanner.nextLine();
        int b = stoi(bIn);
        if (b == Integer.MIN_VALUE) {return;}

        System.out.println("Podaj bok c.");
        String cIn = scanner.nextLine();
        int c = stoi(cIn);
        if (c == Integer.MIN_VALUE) {return;}

        //check if lengths are > 0
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Długość boków musi być większa od zera!");
            return;
        }

        //check if lengths can be sides of a triangle
        if ((a + b > c) && (a + c > b) && (b + c > a))
            if (a == b && b == c)
                System.out.println("Jest to trójkąt równoboczny!\n");
            else if (a == b || b == c || a == c)
                System.out.println("Jest to trójkąt równoramienny!\n");
            else
                System.out.println("Jest to trójkąt różnoboczny!\n");
        else
            System.out.println("Z tych boków nie da się zbudować trójkąta!");
    }

    public static void zad4_1(Scanner scanner) {
        
        //take int from stdin
        System.out.println("Zadanie 4.1: Miesiące");
        System.out.println("Podaj liczbę całkowitą z zakresu 1-12.");
        String input = scanner.nextLine();
        int num = stoi(input);
        if (num == Integer.MIN_VALUE) {return;}

        //print result
        String output = switch (num) {
            case 1, 2, 3:
                yield "Kwartał I.";
            case 4, 5, 6:
                yield "Kwartał II.";
            case 7, 8, 9:
                yield "Kwartał III.";
            case 10, 11, 12:
                yield "Kwartał IV.";

            default:
                yield "Liczba spoza zakresu 1-12!";

        };
        System.out.println(output);
    }

    public static void zad4_2(Scanner scanner) {

        //take number from stdin
        System.out.println("Zadanie 4.2: Dni tygodnia");
        System.out.println("Podaj liczbę całkowitą z zakresu 1-7.");
        String input = scanner.nextLine();
        int num = stoi(input);
        if (num == Integer.MIN_VALUE) {return;}

        //print result
        String output = switch (num) {
            case 1->"poniedziałek";
            case 2->"wtorek";
            case 3->"środa";
            case 4->"czwartek";
            case 5->"piątek";
            case 6->"sobota";
            case 7->"niedziela";
            default->"Liczba spoza zakresu 1-7!";
        };
        System.out.println(output);
    }

    public static void zad5(Scanner scanner) {
        
        //take number from stdin
        System.out.println("Zadanie 5: Pętle for");
        System.out.println("Podaj liczbę całkowitą");
        String input = scanner.nextLine();
        System.out.println();
        int num = stoi(input);
        if (num == Integer.MIN_VALUE) {return;}

        //print result
        if (num > 0) {
            System.out.println("1..n");
            for (int i = 1; i <= num; i++)
                System.out.println(i);
            System.out.println("n..1");
            for (int i = num; i >= 1; i--)
               System.out.println(i);
            System.out.println("1..3..5..15..n");
            for (int i = 1; i <= num; i++)
               if (i%3==0 || i%5==0)
                    System.out.println(i);
            System.out.println("1..3..5...n");
            for (int i = 1; i <= num; i++)
               if (i%3==0 ^ i%5==0)
                    System.out.println(i);
        } else {
            System.out.println("1..n");
            for (int i = 1; i >= num; i--)
                System.out.println(i);
            System.out.println("n..1");
            for (int i = num; i <= 1; i++)
               System.out.println(i);
            System.out.println("1..-3..-5..-15..n");
            for (int i = 1; i >= num; i--)
               if (i%3==0 || i%5==0)
                    System.out.println(i);
            System.out.println("1..-3..-5...n");
            for (int i = 1; i >= num; i--)
               if (i%3==0 ^ i%5==0)
                    System.out.println(i);
        }
        
    }

    public static void zad6(Scanner scanner) {
        
        //init
        boolean cont = true;
        int sum = 0;

        //while (int)stdin != 0 sum ints
        System.out.println("Zadanie 6: Suma");
        while(cont) {
            System.out.println("Podaj liczbę całkowitą (0 - wyjście)");
            String input = scanner.nextLine();
            int num = stoi(input);
            if (num == Integer.MIN_VALUE) {continue;}
            if (Integer.parseInt(input) == 0) {cont = false;}
            sum += num;
        }
        
        //print output
        System.out.println("Suma = " + sum);
                    
    }

    public static void zad7(Scanner scanner) {
        
        //init
        boolean cont = true;
        int counter = 0;
        int sum = 0;

        //do sum and count ints from stdin while number from stdin <=100
        System.out.println("Zadanie 7: Średnia ar.");
        do{
            System.out.println("Podaj liczbę całkowitą (>100 - wyjście)");
            String input = scanner.nextLine();
            int num = stoi(input);
            if (num == Integer.MIN_VALUE) {continue;}
            if (num > 100)
                cont = false;
            else {
                counter++;
                sum += num;
            }
        } while(cont);

        //print output if >0 ints was given else print that no numbers was given
        if (counter != 0)
            System.out.println("Średnia = " + ((float)sum/counter));
        else
            System.out.println("Nie podano liczb!");
    }

    public static void zad8() {

        //for loop with break and continue
        System.out.println("Zadanie 8: Pętla for z continue i break");
        for (int i = 1; i <= 100; i++) {
            if (i == 50) {break;}
            if (i%3!=0) {continue;}
            System.out.println(i);
        }
    }

    /**
     * function generates command line menu that lets user choose one excercise or all excercises-> true or quit menu-> false
     * if wrong number is given -> true
     **/
    public static boolean mainMenu(int num, Scanner scanner) {
        switch (num) {
            case 3:
                zad3(scanner);
                break;
            case 4:
                zad4_1(scanner);
                zad4_2(scanner);
                break;
            case 41:
                zad4_1(scanner);
                break;
            case 42:
                zad4_2(scanner);
                break;
            case 5:
                zad5(scanner);
                break;
            case 6:
                zad6(scanner);
                break;
            case 7:
                zad7(scanner);
                break;
            case 8:
                zad8();
                break;
            case 1:
                zad3(scanner);
                zad4_1(scanner);
                zad4_2(scanner);
                zad5(scanner);
                zad6(scanner);
                zad7(scanner);
                zad8();
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
            System.out.println("Wybierz zadanie. (3, 4, 41 (kwartały), 42 (dni tygodnia), 5, 6, 7, 8 lub 1 - wszystkie zadania, lub 0 - wyjście)");
            String input = scanner.nextLine();
            int num = stoi(input);
            if (num == Integer.MIN_VALUE) {continue;}
            cont = mainMenu(num, scanner);
        }
        //clean up
        scanner.close();
    }
}
