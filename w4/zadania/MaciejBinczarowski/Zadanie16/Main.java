public class Main
{
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("66 8220 2137 0123 1322 0149 6942", 1563.39);

        System.out.println(myAccount.getBalance());
        myAccount.deposit(170);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(83.50);
        System.out.println(myAccount.getBalance());
    }
}