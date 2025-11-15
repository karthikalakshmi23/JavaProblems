abstract class BankAccount {
    private String  AccountHolderName;
    private double  Balance;
    
    // Creating a constructor 
    
    BankAccount(String AccountHolderName, double Balance){
        this.AccountHolderName = AccountHolderName;
        this.Balance = Balance;
    }
    
    
    public String getAccountHolderName(){
        return AccountHolderName;
    }
    
    public void setAccountHolderName(String AccountHolderName){
        this.AccountHolderName = AccountHolderName;
    }
    
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double Balance){
        this.Balance = Balance;
    }
    
    public void deposit(double amount){
        if(amount>0){
            Balance += amount;
            System.out.println("Deposited amount Successfully:" + amount);
        }
        else{
            System.out.println("Deposit properly");
        }
    }
    
    public void withdraw(double amount){
        if(amount>0 && amount<=Balance){
            Balance -= amount;
            System.out.println("Withdraw amount :" + amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    
    // display method 
    
    public void display(){
        System.out.println("Savings Account");
        System.out.println("Account Holder Name :" + getAccountHolderName());
        System.out.println("Account Balance:" + getBalance());
    }
}

class savingsAccount extends BankAccount{
    public savingsAccount(String AccountHolderName, double Balance){
        super(AccountHolderName, Balance);
    }
}

class Main {
    public static void main(String[] args){
        BankAccount savings = new savingsAccount("karthika", 1000.00);
        savings.deposit(5000.00);
        savings.withdraw(500.00);
        
        savings.display();
    }
}
