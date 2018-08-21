package Banking5_2;

public class Customer {
    private String firstName;
    private String lastName;
    private SavingAccount savingAccount;//储蓄账户
    private CheckingAccount checkingAccount;//信用卡账户

//    private Account account;


    public Customer(String f,String l){
        firstName = f;
        lastName = l;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public SavingAccount getSaving() {
        return savingAccount;
    }

    public void setSaving(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public CheckingAccount getChecking() {
        return checkingAccount;
    }

    public void setChecking(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    //    public Account getAccount(){
//        return account;
//    }
//    public void setAccount(Account acct){
//        account=acct;
//    }
//   添加一个账户到Account[]中
//    public void addAccount(Account acct){
//        accounts[numberOfAccounts] = acct;
//        numberOfAccounts++;
//    }
////    返回账户的个数
//    public int getNumOfAccounts(){
//        return numberOfAccounts;
//    }
////    返回指定索引处的账户
//    public Account getAccount(int index){
//        return accounts[index];
//    }
}
