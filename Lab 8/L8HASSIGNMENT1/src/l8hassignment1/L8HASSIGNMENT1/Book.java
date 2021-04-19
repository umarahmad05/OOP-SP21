
package l8hassignment1.L8HASSIGNMENT1;


    
    public class Book extends Publication {
    protected int pagecount;

    public Book() {
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    public int getPagecount() {
        return this.pagecount;
    }

    public void display() {
        super.display();
        System.out.println("Page count: " + this.pagecount);
    }
}

    
