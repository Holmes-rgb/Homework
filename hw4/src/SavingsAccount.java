public class SavingsAccount {
    private double balance;
    private  double interestRate;
    private double lastInterest;

    /**
     * Constructor for the savings account object that takes in the initial balance and interest rate.
     * @param b double indicating original balance in savings account
     * @param i double indicating the annual interest rate
     */
    public SavingsAccount(double b, double i){
        balance = b;
        interestRate = i;
    }

    /**
     * Get the balance from a savings account object.
     * @return returns the balance as a double
     */
    public double getBalance (){
        return balance;
    }

    /**
     * Withdraw funds (decrease balance) from the savings account object.
     * @param d amount to be withdrawn as a double
     */
    public void withdraw (double d){
        balance -= d;
    }

    /**
     * Deposit funds into savings account (increase balance).
     * @param d amount to ba deposited as a double
     */
    public void deposit (double d){
        balance += d;
    }

    /**
     * Get the interest rate of the savings account.
     * @return the interest rate of the savings account
     */
    public double getInterestRate(){
        return interestRate;
    }

    /**
     * Calculate the interest accrued for one month (should be run every month that account is active).
     * and adds it to the balance.
     */
    public void addInterest(){
        lastInterest =  balance * ((interestRate/100)/12);
        balance += lastInterest;
    }

    /**
     * Get the amount of money made from interest.
     * @return the amount of money made from interest in one month
     */
    public double getLastInterest(){
        return lastInterest;
    }

}