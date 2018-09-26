package Banking7;

// 信用卡账户
public class CheckingAccount extends Account {
    private Double overdraftProtection;// 透支额度

    public CheckingAccount(double balance){
        super(balance);
    }

    public CheckingAccount(double balance, double overdraftProtection){
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public double getOverdraftProtection() {
        return overdraftProtection;
    }

    public void setOverdraftProtection(double overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }

    //    取钱
    public void withdraw(double amt) throws OverdraftException {//要取的额度
        if (balance >= amt){
            balance -= amt;
        }else {
            if (overdraftProtection == null){
                throw new OverdraftException("no overdraft exception", amt - balance);
            }else if (overdraftProtection <= amt - balance){
                throw new OverdraftException("Insuffient funds for overdraft exception", amt - balance - overdraftProtection);
            }else {
                overdraftProtection -= amt - balance;
                balance = 0;
            }
        }
    }
}
