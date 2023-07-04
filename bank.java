importjava.util.scanner;
/**
Represents a bank for managing customers and their bank accounts
*/
public class bank {

    /**
    *Main method which is used for running the project or stating point of the code execution.
     *@param args default for printing output to the screen 
     */
      public static void main(string[]args){
        
       /**
        *mybank is an object for creating a bank 
        */


        bank mybank= new bank();

        mybank.open();
        // welcome message 
        System.out.println("welcome to the bank");

        scanner sc=new scanner (system.in);

        // Takes the name of the customer from the user
        System.out.println("Enter the name of the customer");
        String name = sc.nextline();

        // creates the customer with given name
        customer c1 = new customer(name);

        //Greeting message
        System.out.println("we are creating a current and saving account for you :) ");

        // Taking addess of customer from the user
        System.out.println( "what is your address ?");
        String address=sc.nextLine();

        //sets the address to the customer 
        c1.setAddress(address);

           //Taking age input from the user 
                 system,out.println("Alright ! what is your age ?");
        c1.setAge(age);
     
Bankaccount savingsAccount = new BankAccount("savings", c1);
 Bankaccount currentAccount = new BankAccount("current", c1);
Bankaccount loanAccount = new BankAccount("loan", c1);



system.out.println();


system.out.println("customer information is"+ savingsAccount.getcustomerinfo());
system.out.println("Account information is"+ savingsAccount.getAccountinfo());


system.out.println("mr ."+savingsAccount.customer.name );
system.out.println("How much would like to deposit ?");

double depositwAmount =sc.nextDouble();
savingsAccount.deposit(depositamount);

system.out.println("account information is"+ savingsAccount.getAccountinfo());

system.out.println("mr ."+savingsAccount.customer.name );
system.out.println("How much would like to withdraw ?");


double withdrawAmount =sc.nextDouble();
savingsAccount.withdraw(withdrawamount);


system.out.println("account information is"+ savingsAccount.getAccountinfo());

system.out.println();

system.out.println("customer information is" + currentAccount.getAccountinfo());
system.out.println("account information is"+ currentAccount.getAccountinfo());

system.out.println("how much would like to  deposit in your current Account ?");
double currentAmount =sc.nextDouble();
savingsAccount.deposit(currentamount);

system.out.println("account information is"+ currentAccount.getAccountinfo());

system.out.println("we have created a loan account for you");
system.out.println("How much loan would you have ?");
double loanmoney = sc.nextDouble();


system.out.println("when are you going to repay the amount");
int time_in_years =sc.nextDouble();

double interest = loanAccount.get interestpayment(loanmoney, rate_of_interest, time_in_years);

double dept = loanmoney+interest;
system.out.println("you have to total dept of Rs." + dept);

System.out.println("you have to pay interest of" + interest);
System.out.println("your net worth will be"+ (savingsAccount.balance + currentAccount.balance - loanmoney-interest));
mybank.close();

 }

 /**
 *Denotes the running status of the bank
 */
 
 public void close(){
 system.out.println("our bank is closed) ?);
   } 
}


















