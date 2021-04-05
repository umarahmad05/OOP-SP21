
package l6hac1.L6HAC1;


public class Runner {

    
    public static void main(String[] args) {
        
       SavingsAccount saver1 = new SavingsAccount(2000);
       SavingsAccount saver2 = new SavingsAccount(3000);
       
                saver1.modifyInterestRate(.03);
                saver1.calculateMonthlyInterest();
                saver1.display();

                saver2.modifyInterestRate(.03);
                 saver2.calculateMonthlyInterest();
                 saver1.display();

        

    }
    
}
