
package l4ac1.L4AC1;

public class Circle {

    
    private int radius;
    
    public Circle() {
        
       radius = 7;                        // this r won't be used bcz we will change it in another value in runner 
    }
    
        public Circle( int r  ) {
        radius =r;
        }
        
        
 public void setRadius(int r) {
     radius =r;
 }
 
 public int getRadius() {
  return radius;  
}
  
  public void display() { 
     System.out.println("radius = "+radius);    
 }
 
 public void CalculateCircumfrance() { 
     double a=3.14*radius*radius;
     System.out.println("Circumfrance = "+a);        
 } 
 }



   
