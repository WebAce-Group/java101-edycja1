import java.util.Scanner;

public class zadanie_6
{
	public static void main(String[] args)
	{
		boolean n = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("jeżeli chcesz zakończyć program podaj 0");
		System.out.print("podaj liczbę: ");
		int i = scan.nextInt();
		int suma=0;
		while(i!=0)
		{
			suma += i;
			System.out.print("podaj liczbę: ");
			i = scan.nextInt();
		}

		System.out.println("suma podanych liczb wynosi: "+suma);
	}
}


