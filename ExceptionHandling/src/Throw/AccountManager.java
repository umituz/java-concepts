package Throw;

import CustomException.BalanceInsufficientException;

public class AccountManager
{
    private double balance;

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withDraw(double amount) throws BalanceInsufficientException {
        if(this.balance >= amount){
            balance -= amount;
        }else{
            throw new BalanceInsufficientException("Balance Insufficient");
        }
    }

    public double getBalance()
    {
        return this.balance;
    }
}
