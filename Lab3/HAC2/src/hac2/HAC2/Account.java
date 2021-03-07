
package hac2.HAC2;


public class Account {
    
    public int b;
    
   
  public Account() {

  }
  
public Account(int B){
    
    b = B;
}

public void deposit(int B) {
    
    b= b+B;
    
}

public void withdraw(int B) {
    
    b = b - B;
        

}

public void display()
{
    System.out.println("Net cash is: "  + b );
}

   
    
}








