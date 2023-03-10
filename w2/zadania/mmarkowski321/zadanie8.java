package w2.zadania.mmarkowski321;

public class zadanie8 {
    public static void main(String[] args){
        for (int i=1;i<=100;i++){
            if(i%3==0){
                continue;
            }
            if (i==50){
                break;
            }
            System.out.println(i);
        }
    }
}
