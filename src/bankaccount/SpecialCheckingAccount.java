package bankaccount;

public class SpecialCheckingAccount extends CheckingAccount {

    private final double minBalance;
    private final double annualInterestRate;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double annualInterestRate, double minBalance) {
        super(idNumber, startBal, cc);
        this.minBalance = minBalance;
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public void clearCheck(double amount) {
        if (super.currentBalance() > this.minBalance)
            super.decreaseBalance(amount);
        else
            super.clearCheck(amount);
    }

    @Override
    public double monthlyInterest() {
        if (super.currentBalance() > this.minBalance)
            return (super.currentBalance() * annualInterestRate) / 12;
        else
            return super.monthlyInterest();
    }
}
