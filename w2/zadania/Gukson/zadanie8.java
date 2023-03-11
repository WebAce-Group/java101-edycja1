public class zadanie8 {
    public static void main(String[] args) {
        for (int x = 1;x<=100;x++){
            if(x == 5)break;
            if(x%3 != 0)continue;
            System.out.println("x = " + x);
        }
    }
}