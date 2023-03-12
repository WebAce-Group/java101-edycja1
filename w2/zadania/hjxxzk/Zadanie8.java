package w2.zadania.hjxxzk;

public class Zadanie8 {

    public static void main(String[] args) {

        for(int i = 1; i < 100; i++)	{

            if(i == 50)
                break;

            if(i%3 != 0) {
                continue;	}
            else {
                System.out.println(i);	}

        }
    }
}
