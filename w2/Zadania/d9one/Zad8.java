package w2.Zadania.d9one;

public class Zad8 {
    public static void main(String[] args){
        for(int i=1; i<101; i++){
            if(i==50)
                break;
            if(i%3!=0)
                continue;
            System.out.println(i);
        }
    }
}
