/**
 * class BankAccount does the following
 * 1) sets instance variables to default values
 * 2) uses method makeDeposit to add money to the account and keep track of how much was added in total
 * 3) uses method makeWithdraw to subtract money from the account and keep track of how mcuh was withdrawn in total
 * 4) uses method calcInterest to compute the total interest and the interest added after every month
 * 5) uses methods getDeposit, getWithdraw, getInterest to return the total amount withdrawn, deposited, and gained in intrest 
 * @author Adam Shaheen adamhshaheen@gmail.com
 * @version v1.0
 * @since 3/29/2026
 */
public class BankAccount
{
    private double balance;
    private double deposit;
    private double withdraw;
    private double interest;
    private double monthlyIntRate;

    /**
     * sets all variables of the account to their default values.
     */
    public BankAccount()
    {
        monthlyIntRate = 0.044/12;
        balance=deposit=withdraw=interest=0;
    }

    /**
     * calculates monthly interest rate and sets the initial balance of the account to a specific value
     * 
     * @param inBalance is the initial balance (an integer) of the account
     * @param intRate is the yearly intrest rate
     */
    public BankAccount(int inBalance, double intRate)
    {
        monthlyIntRate = (intRate/100)/12;
        balance = inBalance;
    }

    /**
     * calculates monthly interest rate and sets the initial balance of the account to a specific value
     * 
     * @param inBalance is the initial balance (a positive number) of the account
     * @param intRate is the yearly intrest rate
     */
    public BankAccount(double inBalance, double intRate)
    {
        monthlyIntRate = (intRate/100)/12;
        balance = inBalance;
    }

    /**
     * deposits a specified value into the account and counts how much was added
     * 
     * @param add is how much is being deposited into the account (a positive number)
     */
    public void makeDeposit(double add)
    {
        balance += add;
        deposit += add;
    }

    /**
     * deposits a specified value into the account and counts how much was added
     * 
     * @param add is how much is being deposited into the account (an integer)
     */
    public void makeDeposit(int add)
    {
        balance += add;
        deposit += add;
    }

    /**
     * withdraws a specified value from the account and counts how much was taken out
     * 
     * @param sub is how much is being withdrawn from the account (a positive number)
     */
    public void makeWithdraw(double sub)
    {
        balance -= sub ;
        withdraw += sub;
    }

    /**
     * withdraws a specified value from the account and counts how much was taken out
     * 
     * @param sub is how much is being withdrawn from the account (an integer)
     */
    public void makeWithdraw(int sub)
    {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * checks if balance is positive, then calculates how much interset there is if its positive
     * adds this value to the total balance
     */
    public void calcInterest()
    {
        if(balance>0){
            interest += balance*monthlyIntRate;
            balance += balance*monthlyIntRate;
        }
    }

    /**
     * returns the total balance of the account
     * 
     * @return the balance in the account
     */
    public double getBalance()
    {
        return balance;   
    }    

    /**
     * returns the total amount deposited into the acount
     * 
     * @return the total amount deposited
     */
    public double getDeposit()
    {
        return deposit;
    }    

    /**
     * returns the total amount withdrawn from the acount
     * 
     * @return the total amount withdrawn
     */
    public double getWithdraw()
    {
        return  withdraw;
    }    

    /**
     * returns the total amount of interest collected
     * 
     * @return the total amount of interest
     */
    public double getInterest()
    {
        return interest;
    }    
}