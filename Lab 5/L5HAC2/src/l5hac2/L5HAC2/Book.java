
package l5hac2.L5HAC2;


public class Book {
    	private String author;
	private String [] chapterNames;
	
	
	public Book() {
		author="unkown";
		chapterNames= new String [] {"unkown"};
	}
	
	
	public Book(String a, String [] chap) {
		author = a;
		chapterNames=chap;
	}
	
	
	public void setAuthor(String x) {
		author=x;
	}
	
	
	public void setChapterNames(String [] chN) {
		chapterNames=chN;
	}
	
	
	public boolean compareAuthors(Book b) {
		if (this.author==b.author) {
			return true;
		}
		else return false;
	}
	
	
	public void compareChapterNames (Book b) {
		if (this.chapterNames.length>b.chapterNames.length) {
			System.out.println("Book with author name "+this.author+" has more chapters!");
		}
		else System.out.println("Book with author name "+b.author+" has more chapters!");
	}
	
	

}

