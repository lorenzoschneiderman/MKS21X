// LibraryBook.java


abstract class LibraryBook extends Book
implements Comparable<LibraryBook>{
	private String callNumber;


	public LibraryBook(String author, String title, String iSBN, String callNumber){
		super(author,title,iSBN);
		this.callNumber = callNumber;
	}

	public String getcallNumber(){
		return callNumber;
	}

	abstract void checkout(String patron, String due);

	abstract void returned();

	abstract String circulationStatus();

	public int compareTo(LibraryBook obj){
		// if (NumberUtil.isNumber(this) &&  NumberUtil.isNumber(obj)){
		// 	return Integer.parseInt(this.getcallNumber()) - Integer.parseInt(obj.getcallNumber());
		// }
		// else{
		return -1;
		// }
	}

	public String toString(){
		return super.toString() + ", " + getcallNumber();
	}

}
