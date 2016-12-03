// ReferenceBook.java

public class ReferenceBook extends LibraryBook{
	private String collection;

	public ReferenceBook(String lA, String lT, String lI, String lC, String lN){
		super(lA, lT, lI, lC);
		collection = lN;
	}

	public boolean setCollection(String aCollection){
		collection = aCollection;
		return true;
	}

	public String getCollection(){
		return collection;
	}

	public void checkout(String patron, String duedate){
		System.out.println("don't check out a ReferenceBook");	
	}
	public String circulationStatus(){
		return "non-circulating ReferenceBook";
	}
	public void returned(){
		System.out.println("you're in big trouble mister");
	}


	public String toString(){
		return super.toString() + ", " + getCollection();
	}
}