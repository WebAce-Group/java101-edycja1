package w2.zadania.Maksymilian74;
public class zadanie8 {
        public static void main(String[] args) {
            System.out.println("Liczby podzielne przez 3: ");
            for(int i=1;i<=100;i++)
            {
                if(i == 50)
                    break;
                if(i % 3 == 0)
                    System.out.println(i);
            }
        }
}
