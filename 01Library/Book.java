// Book.java
public class Book{
	private String author, title, isbn;
	
	public Book(){
		this("armadillo","Yellow","1234");

	}


	public Book(String aauthor, String atitle, String aISBN){
		author = aauthor;
		title = atitle;
		isbn = aISBN;
	}
	
	public boolean setAuthor(String aauthor){
		author = aauthor;
		return true;
	}
	public String getAuthor(){
		return author;
	}

	public boolean setISBN(String aISBN){
		isbn = aISBN;
		return true;
	}
	public String getISBN(){
		return isbn;
	}

	public boolean setTitle(String atitle){
		title = atitle;
		return true;
	}
	public String getTitle(){
		return title;
	}

	// public static void main(String[] args) {
	// 	Book a = new Book();
	// 	System.out.println(a);
	// }

	public String toString(){
		return author + ", " + title + ", " + isbn;
	}
}