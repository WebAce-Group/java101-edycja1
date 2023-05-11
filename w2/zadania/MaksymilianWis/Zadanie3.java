package w2.zadania.MaksymilianWis;

import java.util.Scanner;
public class Zadanie3{
    class funkcje{
        public static void trojkat(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj pierwszy bok: ");
            int bok1 = scan.nextInt();
            scan.nextLine();

            System.out.println("Podaj drugi bok: ");
            int bok2 = scan.nextInt();
            scan.nextLine();

            System.out.println("Podaj trzeci bok: ");
            int bok3 = scan.nextInt();

            if((bok1+bok2>bok3) && (bok2+bok3>bok1) && (bok3+bok1>bok2) )
            {
                if(bok1==bok2 && bok2==bok3){
                    System.out.println("Trojkat jest rownoboczny");
                }
                else if(bok1==bok2 || bok2==bok3 || bok3==bok1){
                    System.out.println("Trojkat jest rownoramienny");
                }
                else{
                    System.out.println("Trojkat jest roznoramienny");
                }
            }
            else{
                System.out.println("Nie mozna stworzyc trojkata");
            }
            scan.close();
        }
    }
    
    public static void main(String[] args) {
        
        funkcje.trojkat();
    }
    

}
