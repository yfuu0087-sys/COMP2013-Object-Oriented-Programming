import java.util.ArrayList; 

public class Library {//the most important Library
	private ArrayList<ModelListener> listeners=new ArrayList<>();
	private String name;
	private ArrayList<IUser> users=new ArrayList<>();
	private ArrayList<Integer> history=new ArrayList<>(0);
	public Library(String name) {
		this.name=name;
	}
	public void addUser(IUser user) {//use to add userr
		users.add(user);
		int a=totalBorrowedBooks();
		history.add(a);
		notifyListeners();
	}
	public int totalBorrowedBooks() {
		int sum=0;
		for(IUser user:users) {
			sum+=user.getBook();
		}
		return sum;
	}
	public int getBook(String name) throws UnknownUserException{//use to get the number of book
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getName().equals(name)) {
				return users.get(i).getBook();
			}	
		}
		throw new UnknownUserException("User"+name+"unfound");
	}
	public void moreBook(String name,int number)throws UnknownUserException,NotALenderException{//use to add the number of book
		boolean setboolean=true;
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getName().equals(name)) {
				setboolean=false;
				IUser iuser=users.get(i);
				iuser.moreBook(number);
				users.set(i, iuser);
			}
			
		}
		if(setboolean) {
			throw new UnknownUserException("User"+name+"unfound");
		}else {
			int a=totalBorrowedBooks();
			history.add(a);
			notifyListeners();
		}

	}
	public void addListener(ModelListener m) {//add Listener
		listeners.add(m);
	}
    private void notifyListeners(){
        for (int i = 0; i < listeners.size(); i++) {
            listeners.get(i).update();
        }
    }
    public ArrayList<Integer> getHistory(){//the arraylist of int
    	return history;
	}
	public static void testLibrary() {
		Library li = new Library("UIC Library");
		System.out.println(li.totalBorrowedBooks() == 0);
		li.addUser(new Lender("L1", 10));
		try {
			System.out.println(li.getBook("L1") == -10);
			System.out.println(li.totalBorrowedBooks() == -10);
		li.addUser(new Borrower("B1", 20));
			System.out.println(li.getBook("L1") == -10);
			System.out.println(li.getBook("B1") == 20);
			System.out.println(li.totalBorrowedBooks() == 10);
			li.getBook("B2");
		} catch(UnknownUserException ex) {
			System.out.println(ex.getMessage().equals("User B2 unknown."));
		} catch(NotALenderException ex) {
			System.out.println(false);
		}
		//More test cases are needed¡­
		//Lender
		try {
			li.moreBook("L1", 20);
			System.out.println(li.getBook("L1")==-120);
			System.out.println(li.totalBorrowedBooks()==-100);
		}catch(UnknownUserException e) {
			e.printStackTrace();
		}catch(NotALenderException e) {
			e.printStackTrace();
		}
		//Borrower
		try {
			li.addUser(new Borrower("b1",0));
			li.moreBook("b1",200);
			System.out.println(li.getBook("b1")==200);
			System.out.println(li.totalBorrowedBooks()==-100);
			li.moreBook("b1", 300);//error data
			System.out.println(li.getBook("b1")==200);
		}catch(NotALenderException e){
			System.out.println(e.getMessage().equals("A borrower cannot lend 200 book(s)"));
		}catch(UnknownUserException e) {
			System.out.println("This should never happen");
		}
		}
}
