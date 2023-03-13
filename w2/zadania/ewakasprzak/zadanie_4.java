import java.util.Scanner;

public class zadanie_4
{
	public static void kwartal(int n)
	{
		switch(n)
		{
			case 1 : System.out.println("pierwszy kwartał");
				 break;

			case 2 : System.out.println("pierwszy kwartał");
				 break;

			case 3 : System.out.println("pierwszy kwartał");
				 break;

			case 4 : System.out.println("drugi kwartał");
				 break;

			case 5 : System.out.println("drugi kwartał");
				 break;

			case 6 : System.out.println("drugi kwartał");
				 break;

			case 7 : System.out.println("trzeci kwartał");
				 break;

			case 8 : System.out.println("trzeci kwartał");
				 break;

			case 9 : System.out.println("trzeci kwartał");
				 break;

			case 10 : System.out.println("czwarty kwartał");
				  break;

			case 11 : System.out.println("czwarty kwartał");
				  break;

			case 12 : System.out.println("czwarty kwartał");
				  break;

			default : System.out.println("liczba spoza zakresu 1-12");
		}
	}

	public static String dzien(int n)
	{
		return switch(n)
                {
                        case 1 : yield "poniedziałek";

                        case 2 : yield "wtorek";

                        case 3 : yield "środa";

                        case 4 : yield "czwartek";

                        case 5 : yield "piątek";

                        case 6 : yield "sobota";

                        case 7 : yield "niedziela";

                        default : yield "liczba spoza zakresu 1-7";
                }
	}
	

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("podaj numer miesiąca: ");
		int a = scan.nextInt();
		kwartal(a);
		System.out.print("podaj numer dnia tygodnia: ");
		int b = scan.nextInt();
		System.out.println(dzien(b));

	}
}

