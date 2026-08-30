public class Account {
    public static void main(String[] args) {
        System.out.println("=====================");
        BankAccount C1 = new BankAccount();
        System.out.println(C1);
        System.out.println("Balance left: Rs. "+ C1.getBalance());
        System.out.println("=====================");

        BankAccount C2 = new BankAccount("334201231238", "Vishal");
        System.out.println(C2);
        C2.deposit(12000);
        C2.withdraw(10000);
        System.out.println("Balance left: Rs. "+ C2.getBalance());
        
        System.out.println("=====================");
        
        BankAccount C3 = new BankAccount("984201231678", "Vijay Mallya", 9000);
        System.out.println(C3);
        C3.deposit(2000);
        C3.withdraw(40000);
        System.out.println("Balance left: Rs. "+ C3.getBalance());

        System.out.println("=====================");
        
        BankAccount C4 = new BankAccount("984201231678", "Nirav Modi", -1000);
        System.out.println(C4);
        System.out.println("Balance left: Rs. "+ C4.getBalance());

        System.out.println("=====================");
    }
}
