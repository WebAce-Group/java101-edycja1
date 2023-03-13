import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] arg){
        Scanner text = new Scanner(System.in);
        System.out.println("Podaj boki trójkąta: ");
        int a = text.nextInt();
        int b = text.nextInt();
        int c = text.nextInt();
        boolean ujemne = true, trojkat = true;
        if((a | b | c)<0 | a==0 | b==0 | c==0){
            System.out.println("Bok nie może być ujemny lub równy zero!");
            ujemne = false;
        }

        if(ujemne){
            if((a>=b & a>=c) & b+c>a ){
                System.out.println("Można utworzyć trójką z podanych boków");
            }else if((b>=a & b>=c) & a+c>b){
                System.out.println("Można utworzyć trójką z podanych boków");
            }else if ((c>=a & c>=b) & a+b>c){
                System.out.println("Można utworzyć trójką z podanych boków");
            }else{
                System.out.println("Nie można utworzyć trójkąta z podanych boków");
                trojkat = false;
            }
        }

        if(trojkat & ujemne){
            if (a==b & a==c){
                System.out.println("Trójkąt jest równoboczny");
            }else if(a!=b & a!=c & b!=c){
                System.out.println("Trójkąt jest różnoboczny");
            }else{
                System.out.println("Trójkąt jest równoramienny");
            }
        }
    }
}
