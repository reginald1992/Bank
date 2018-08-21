package Banking6.domain;

// 信用卡账户
public class CheckingAccount extends Account {
    private double overdraftProtection;// 透支额度

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
    public boolean withdraw(double amt){//要取的额度
        if(balance >= amt){
            balance -= amt;
            return true;
        }else if (overdraftProtection >= amt - balance){
            overdraftProtection -= amt - balance;
            balance = 0;
            return true;
        }else{
            System.out.println("余额不足");
            return false;
        }
    }
}
