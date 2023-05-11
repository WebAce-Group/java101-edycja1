package w2.Zadania.JBar02;

public class Zadanie8 {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            if(i==50) break;
            if(i%3!=0)  continue;
                else System.out.print(" "+i);

        }
    }
}