public class Zadanie8 {
    public static void main(String[] args){
        for (int i = 1; i<=1000; i++){
            if (i == 50)
                break;
            if (i%3 != 0)
                continue;
            System.out.println(i);
        }
    }
}