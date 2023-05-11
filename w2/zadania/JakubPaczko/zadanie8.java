public class zadanie8 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i % 3 == 0){
                System.out.println(i);
                continue;
            }

            if(i >= 50){
                break;
            }
        }
    }
}
