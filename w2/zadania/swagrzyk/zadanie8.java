public class zadanie8 {
    public static void main(String[] args) {
        System.out.println(" wszystkie liczby od 0 do 100");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " , ");
        }
        System.out.println(" liczby od 0 do 1, ale tylko te, które są podzielne przez 3");
        for (int i = 1; i <= 100; i++) {
            if ( i % 3 == 0 & i<50 ) {
                System.out.print(i + " , ");
            }
        }
        System.out.println();
    }
}
