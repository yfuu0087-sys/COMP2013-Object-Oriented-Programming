
public class Borrower extends User{
	public Borrower(String name,int book) throws NotALenderException{//take string name and int book as argument
		super(name,book);
		if(book<=0) {//to see if the number error.
			throw new NotALenderException("A new borrower cannot lend books.");
		}
	}
	public void moreBook(int number) throws NotALenderException{//use to add book to a borrower
		setBook(getBook()+number);
		if(getBook()-number<0) {
			throw new NotALenderException("A borrower cannot lend"+getBook()+"-"+number+"book(s).");
		}
	}
	public static void testBorrower() {//test
			try {
				Borrower b1=new Borrower("a",-1);
			}catch(NotALenderException e) {
				System.out.println(e.getMessage().equals("A new borrower cannot lend books."));
			}
			try {
				Borrower b2=new Borrower("a",1);
				System.out.println(b2.getName()=="a");
				System.out.println(b2.getBook()==1);
				b2.moreBook(2);
				System.out.println(b2.getBook()==3);
				b2.moreBook(-4);
			}catch(NotALenderException e) {
				System.out.println(e.getMessage().equals("A borrower cannot lend 3--4 books"));
			}
	}
}
