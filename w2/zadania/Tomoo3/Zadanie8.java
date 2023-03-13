package w2.zadania.Tomoo3;

public class Zadanie8 {
    public static void main(String[] args){
        for (int i=1; i<=100; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
            else if (i == 50){
                System.out.println(i);
                break;
            }
        }
    }
}
