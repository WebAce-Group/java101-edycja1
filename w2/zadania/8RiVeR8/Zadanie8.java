public class Zadanie8 {
    public static void main(String[] arg){
        for(int i=1; i<=100; i++){
            if(i==50)
                break;
            if(i%3!=0)
                continue;
            System.out.println(i);
        }
    }
}
