package w2.Zadania.andrzejk00;

public class Zadanie8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            if(i%3 == 0){
                System.out.printf("%4d",i);
            }
            if(i == 50)
                break;
        }
    }
}
