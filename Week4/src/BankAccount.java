public class BankAccount 
{
    private String accountNumber = "No Data fetched !";
    private String ownerName = "Unallocated";
    private double balance = 0;

    BankAccount(){}
    BankAccount(String accountNumber,String ownerName)
    {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    BankAccount(String accountNumber,String ownerName, double balance) 
    {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (balance<0){
            System.out.println("You entered a non negative balance !");
            this.balance = 0; 
        } else {
            this.balance = balance;
        }
    } 

    public String toString(){
        return "Account Owner: " + ownerName + " | A/C no:  " + accountNumber + " | Balance: " + balance;
    }

    boolean deposit(double amount)
    {
        if (amount==0 || amount<0)
        {
            return false;
        } else {
            balance += amount;
            return true;
        }
    }

    boolean withdraw(double amount)
    {
        if (amount<=balance)
        {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient Balance to Withdraw !");
            return false;
        }
    }

    String getOwnerName()
    {
        return ownerName;
    }
    String getAccountNumber()
    {
        return accountNumber;
    }
    double getBalance()
    {   
        if (balance>0){
            return balance;
        } else {
            return -balance;
        }
    }


    

}
