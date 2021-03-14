
package l4ac2.L4AC2;

public class Rectangle {
     private int length, width;

    public Rectangle() {
        
   length = 5; width = 2;               // Constructor
}
    
public Rectangle(int l, int w) {

length = l; width = w;                       // Constructor
        
}

public void setLength(int l) {

    length = l;
}

public void setWidth(int w) {
    
    width = w; 
}

public int getLength() {
    return length;
    
}

public int getWidth() {
    return width;
}

public int area ()  {
    return (length*width);
}
}


    

    
    
