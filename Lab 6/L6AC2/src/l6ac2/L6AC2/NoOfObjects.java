
package l6ac2.L6AC2;


public class NoOfObjects {
     
    private static int objs=0;
      private int a;
      
      
    public NoOfObjects(){
       objs++;
}
      
    public NoOfObjects(int x){
          a=x;
         objs++;
}

     public static int getObjs (){
            return objs;
}
}

    
