package TestBanking;/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the exer.Customer (with an initial balance),
 * and performs a series of transactions with the exer.Account object.
 */

import Banking4.*;

public class TestBanking4 {

  public static void main(String[] args) {
    Bank bank = new Bank();

    // Add exer.Customer Jane, Simms
      bank.addCustomer("Jane","Simms");
	//code
    //Add exer.Customer Owen, Bryant
      bank.addCustomer("Owen","Bryant");
	//code
    // Add exer.Customer Tim, Soley
      bank.addCustomer("Tim","Soley");
	//code
    // Add exer.Customer Maria, Soley
      bank.addCustomer("Maria","Soley");
	//code
    for ( int i = 0; i < bank.getNumberOfCustomers(); i++ ) {
      Customer customer = bank.getCustomer(i);

      System.out.println("exer.Customer [" + (i+1) + "] is "
			 + customer.getLastName()
			 + " " + customer.getFirstName());
    }
  }
}
