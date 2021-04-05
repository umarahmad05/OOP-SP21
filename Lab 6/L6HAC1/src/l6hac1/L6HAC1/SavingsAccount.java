
package l6hac1.L6HAC1;


public class SavingsAccount {
    
    public static double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount() {
    
    annualInterestRate = 0;
    savingsBalance =  0;
    
}
    public SavingsAccount( double balance ) {
        savingsBalance = balance;
        
    }
    
        public void setsavingsBalance(double balance) {
        
                savingsBalance = balance;             
    }
    
        public double getsavingsBalance() {
            return savingsBalance;
        }
        
        
        public double calculateMonthlyInterest() {
            
            double monthlyInterest;
            
            monthlyInterest = (savingsBalance * annualInterestRate)/12;
                    savingsBalance += monthlyInterest;
                    return savingsBalance;

           }
        
        public static void modifyInterestRate(double newInterestRate) {
                   annualInterestRate = newInterestRate;

                   }
        
        public void display() {
            
            System.out.println("  Bal " +savingsBalance );
        }
        


        
        
       
            
       
        
        
         
        
        
        
     
 
        
        
        

        
        
        
        
        
        
        

    
    
    
    
    
    
    
    
    
}
