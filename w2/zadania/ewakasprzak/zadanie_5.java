import java.util.Scanner;

public class zadanie_5
{
	public static void wyswietl_rosnaco(int n)
	{
		for(int i=1; i<=n; i++)
		{
			System.out.println(i);
		}
	}

	public static void wyswietl_malejaco(int n)
	{
		for(int i=n; i>0; i--)
		{
			System.out.println(i);
		}
	}

	public static void wyswietl_podzielne(int n)
	{
		for(int i=1; i<=n; i++)
		{
			if(i%3==0 || i%5==0) System.out.println(i);
		}
	}

	public static void wyswietl_podzielne_1(int n)
	{
		for(int i=1; i<=n; i++)
		{
			if(i%3==0 ^ i%5==0) System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("podaj liczbę naturalną dodatnią: ");
		int a = scan.nextInt();
		
		if(a>0)
		{
			System.out.println("--------");
			wyswietl_rosnaco(a);
			System.out.println("--------");
			wyswietl_malejaco(a);
			System.out.println("--------");
			wyswietl_podzielne(a);
			System.out.println("--------");
			wyswietl_podzielne_1(a);
		}
	}
}

