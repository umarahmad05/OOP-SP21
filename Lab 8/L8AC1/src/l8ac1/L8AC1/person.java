
package l8ac1.L8AC1;


public class person {
    
    protected String name ;      // Protected keyword in Java refers to one of its access modifiers. The methods or data members declared as                                        
    protected String id ;       // //   protected can be accessed from: 
    protected int phone ;        // 1 -  Within the same class. ,  2  Subclasses of same packages. 3 Different classes of same packages.
                                   // 4  Subclasses of different packages.
    
    
    public person() {
     name = "NaginaNazar" ;
     id = "sp14bcs039" ;
     phone = 12345 ;
}
    
    public person(String a , String b , int c) {
       name = a ;
        id = b ;
         phone = c ;
}
    
    public void setName(String a){
       name = a ;
}
    
    public void setId(String j){
        id = j ;
}
     public void setPhone(int a) {
      phone = a ;
}
       
     public String getName() {
      return name ;
}
      public String getid() {
       return id ;
}
       public int getPhone() {
       return phone ;
}
       
public void display() {
    
        System.out.println("Name : " + name + "ID : " + id + "Phone : " + phone ) ;
}
}
    

