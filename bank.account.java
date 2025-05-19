package com.bank.accountss;

public class BankAccount {
	private String accountnumber;
	private double balance;
	public void setaccountnumbetr(String  accountnumber) {
		this.accountnumber=accountnumber; 
		}
	public void setbalanace(double balance) {
		this.balance=balance;
	}
	public String getnumber() {
		return accountnumber;
	}
	
	public double balance() {
		return balance;
	}
	public void  showAccountDetails() {
		System.out.println(" accountnumber:"+accountnumber);
	      System.out.println("balance:"+balance);
}
}
package com.bank.accountss;

public class Customer {
	private String customername;
	private int customerid;
	public void setcustomername( String customername){
		this.customername=customername;
		
	}
	public  void setcustomerid( int customerid) {
		this.customerid=customerid;
		
	}

	
	public String getcustomername(){
		return customername;
	}
		public int getcustomerid() {
			return customerid ;
		}
		 public void customerdetails() {
			 System.out.println("customername:"+customername);
			 System.out.println("customerid:"+ customerid);
}
}
			 
			
		package com.bank.accountss;

import com.bank.accountss.BankAccount;
import com.bank.customers.Customer;

public class BankApp {
	public static void main(String[] args) {
		BankAccount f2 = new BankAccount();
		f2.setaccountnumber("123456");
		f2.setbalanace(1200);
		Customer A2 = new Customer();
		A2. setcustomername("gopi");
		A2.setcustomerid(67);
		System.out.println();
		f2.showAccountDetails();
		A2.customerdetails();
		
		
		
		
	}

}

	
	
		
	


	
	
	
	
