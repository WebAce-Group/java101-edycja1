public class Main {
    public static void main(String[] args) {

        for (int i=0;i<100;i++)
        {
            if (i+1==50) break;
            if ((i+1)%3!=0) continue;
            System.out.println(i+1);
        }
    }
}