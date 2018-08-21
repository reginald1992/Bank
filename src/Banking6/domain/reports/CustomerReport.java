package Banking6.domain.reports;

import Banking6.domain.CheckingAccount;
import Banking6.domain.SavingAccount;
import Banking6.domain.Account;
import Banking6.domain.Bank;
import Banking6.domain.Customer;

import java.text.NumberFormat;


public class CustomerReport {
    Bank bank = Bank.getBanking();
    Customer customer;
    public void generateReport() {
        // Generate a report
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        NumberFormat currency_format = NumberFormat.getCurrencyInstance();
        for (int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++) {
            customer = bank.getCustomer(cust_idx);

            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++) {
                Account account = customer.getAccount(acct_idx);
                String account_type = "";
                if(account instanceof SavingAccount){
                    account_type = "SavingAccount";
                }
                if (account instanceof CheckingAccount){
                    account_type = "CheckingAccount";
                }
                System.out.println(account_type + "current balance is " + currency_format.format(account.getBalance())+ account.getBalance());

            }
        }
    }
}


