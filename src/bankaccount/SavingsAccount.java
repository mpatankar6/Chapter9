package bankaccount;

public class SavingsAccount extends Account {

    double interestRate;

    public SavingsAccount(int id, double startBal, double interestRate) {
        super(id, startBal);
        this.interestRate = interestRate;
    }

    public void withdraw(double amt) {
        if (super.currentBalance() < amt) {
            return;
        }
        super.decreaseBalance(amt);
    }

    @Override
    public double monthlyInterest() {
        return (super.currentBalance() * interestRate) / 12;
    }
}