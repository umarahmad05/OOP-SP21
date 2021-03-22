
package l5hac1.L5HAC1;


public class Distance {
    
    private int feet, inches;
    
    public Distance()  {
        
        feet = 5;
        inches = 5;
    }
    
    public Distance(int a , int b) {
        
        feet = a;
        inches  = b;
    }
    
    public void SetFeet(int a) {
        feet = a;
    } 
    
    public void SetInches(int b) {
        inches = b;
    }
    
    public int GetFeet() {
        return feet;
    }
    
    public int GetInches() {
        return feet;
    }
    
    public Distance Add(Distance a) {
        
        Distance d_new = new Distance(feet + a.feet, inches + a.inches);
        return d_new;
    }
    
    public void display() {
        System.out.println( " FEET " +feet );
                System.out.println( " Inches " +inches );

    }
               
    
}
