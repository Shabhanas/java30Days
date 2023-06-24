*
* represence a current account / saving account for a customer
 */
public class bank account {

    // instance variables

    /**
    *Type of account(saving/ current)
    */
    String account type;

    /**
    * balance for the bank account
    */
    double balance;

    /**
    * customer for this bank account 
    */
    customer customer ;



    /**
    * create a bank account of given type for the given customer
    *@param account type is either savings of current account 
    @param customer from the customer.java user defined data type
    */
    public bank account (String account type, customer customer){
        this. account type= account type;
        this.customer =customer ;
    }

     // methods

    /**
 * deposits the  given amount
@param  amount to be added.
*/
public void deposit (double amount){
 this.balance =this.balance + amount;
    //this.balance+=amount;
}
/**
* withdraws the given amount
*@param amount to be withdrawn
*/
public void withdraw (double amount){   
    if(this.balance > amount) {
        this.balance = this.balance - amount;
    }
    else {
        system.out.println("balance is less than the given amount ");
    }
}

/**
* prints the account information of this bank account 
*@return customer information is returned
*/
public string getaccount type + " " + this.balance;
}

/**
* prints  the customer information of this bank account
*return customer information is returned 
*/
public string getcustomer info(){
    return this.customer.name + " "+this.customer.address +" "+this.customer.age;
}
 public double get intrest payment(double amount, double rate-of-interest, int time_in_years){
    double intrest = (amount * rate_of_interest * time_in_years)/100;
    return interest;
     }