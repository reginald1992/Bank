package Banking5;
// 储蓄账户
public class SavingAccount extends Account {
    private double interestRate;// 利率

    public SavingAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
