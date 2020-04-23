package Throw;

public class AccountManager
{
    private double balance;

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withDraw(double amount) throws Exception {
        if(this.balance >= amount){
            balance -= amount;
        }else{
            throw new Exception("insufficient funds");
        }
    }

    public double getBalance()
    {
        return this.balance;
    }
}
