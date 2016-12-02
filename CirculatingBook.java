// CirculatingBook.java

public class CirculatingBook extends LibraryBook{
	private String currentHolder, dueDate;

	public CirculatingBook(String author, String title, String isbn, String call){
		super(author,title,isbn,call);
	}

	public void checkout(String patron, String dueDate){
		this.currentHolder = patron;
		this.dueDate = dueDate;
	}

	public void returned(){
		currentHolder = null;
		dueDate = null;
	}

	public String circulationStatus(){
		if(currentHolder == null){
			return getTitle() + " is available";
		}
		else{
			return currentHolder + ", " + dueDate;
		}
	}

	public String toString(){
		if(currentHolder == null){
			return super.toString();
		}
		else{
			return super.toString() + ", " + circulationStatus();
		}
	}
}