import java.util.*;

class KontoBankowe
{
	private int numerKonta_;
	private double saldo_;
	
	public KontoBankowe(int numerKonta, double saldo)
	{
		numerKonta_ = numerKonta;
		saldo_ = saldo;
	}
	
	public void deposit(double kwota)
	{
		saldo_ += kwota;
	}
	
	public void withdraw(double kwota)
	{
		saldo_ -= kwota;
	}
	
	public double getSaldo()
	{
		return saldo_;
	}
	
	public static void main(String args[])
	{
		KontoBankowe klient1 = new KontoBankowe(123456789, 100000);
		System.out.println(klient1.getSaldo());
		//klient1.deposit(x);
		//klient1.withdraw(y);
		//System.out.println(klient1.getSaldo());
	}
}
