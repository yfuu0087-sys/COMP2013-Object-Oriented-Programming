
public class Lender extends User{//lender important
	public Lender(String name,int book) {
		super(name,-book);
	}
	public void moreBook(int number) {
		setBook(getBook()-number);
	}

	public static void testLender() 
	{
	Lender l = new Lender("Anna",5);
	System.out.println(l.getName() == "Anna");
	System.out.println(l.getBook() == -5);
	l.setBook(-6);
	System.out.println(l.getBook() == -6);
	l.moreBook(2);
	System.out.println(l.getBook() == -8);
	l.moreBook(-9);
	System.out.println(l.getBook() == 1);
	}
}
