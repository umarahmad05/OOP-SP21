
package l5hac2.L5HAC2;


public class Runner {

    
    public static void main(String[] args) {
        
        		Book b1 = new Book();
		b1.setAuthor("S.A. Lewis");
		String [] array1 = {"Chap1", "Chap2", "Chap3", "Chap4"};
		b1.setChapterNames(array1);
		
		
		String [] array2 = {"Chap2","Chap2","Chap3"};
		Book b2 = new Book("S.A. Lewis", array2);
		
		System.out.println(b1.compareAuthors(b2));
		b1.compareChapterNames(b2);

	}

}

    

