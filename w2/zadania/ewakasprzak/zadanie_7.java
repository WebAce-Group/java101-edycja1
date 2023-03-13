import java.util.Scanner;

public class zadanie_7
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("aby przerwać program podaj liczbę większą od 100");
		System.out.print("podaj liczbę: ");
		double n = scan.nextDouble();
		double srednia = 0.00;

                if(n<=100.00)
                {
                        double i=0.00;
                        do
                        {
                                srednia += n;
                                i++;
				System.out.print("podaj liczbę: ");
                                n = scan.nextInt();
                        } while(n<=100.00);

                        System.out.println("srednia podanych liczb wynosi: " + srednia/i);
                }
                else System.out.println("podana liczba jest większa od 100");
	}
}


