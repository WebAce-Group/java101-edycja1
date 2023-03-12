import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x){
            case 1,2,3:
                System.out.print("First quarter");
                break;
            case 4,5,6:
                System.out.print("Second quarter");
                break;
            case 7,8,9:
                System.out.print("Third quarter");
                break;
            case 10,11,12:
                System.out.print("Fourth quarter");
                break;
            default:
            System.out.print("Wrong month");
        }
        int b = scanner.nextInt();
        String dz = switch(b){
            case 1 -> "Pon";
            case 2 -> "Wt";
            case 3 -> "Sr";
            case 4 -> "Czw";
            case 5 -> "Pt";
            case 6 -> "Sob";
            case 7 -> "Nd";
            default -> "Nie ma takiego dnia";

        };
        System.out.println("\n"+dz);
    }
}