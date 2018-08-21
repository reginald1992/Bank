package Banking5_2;

// 信用卡账户
public class CheckingAccount extends Account {
//    private double overdraftProtection;// 透支额度
    private SavingAccount protectedBy;//透支额度

    public CheckingAccount(double balance){
        super(balance);
    }

    public CheckingAccount(double balance, SavingAccount protect){
        super(balance);
        this.protectedBy = protect;
    }

    public SavingAccount getProtectedBy() {
        return protectedBy;
    }

    public void setProtectedBy(SavingAccount protectedBy) {
        this.protectedBy = protectedBy;
    }

    //    取钱
    public boolean withdraw(double amt){//要取的额度
        if (balance >= amt){
            balance -= amt;
            return true;
        }else if (protectedBy != null && protectedBy.getBalance() >= (amt - balance)){
            protectedBy.withdraw(amt-balance);
            balance = 0;
            return true;
        }else{
            return false;
        }
    }
}
