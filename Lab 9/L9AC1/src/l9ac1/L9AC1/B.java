
package l9ac1.L9AC1;


class B extends A {
    
    int k;
    
  public  B(int a, int b, int c) {
      super(a, b);
      k = c;
}
                                                 // display k – this overrides show() in A
void show() {
System.out.println("k: " + k);
}
}
    

