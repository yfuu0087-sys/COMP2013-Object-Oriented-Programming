import java.util.Scanner;
import java.util.InputMismatchException;

public class CLI {
	public static void main(String[] args) throws UnknownUserException,NotALenderException{
		Library L=new Library("UicLibrary");
		while(true) {//to let the function work in a dead loop
			int p1 = readPosInt("Type an action (total:1 add:2 get:3 more:4 less:5 quit:6): ");//the choose of the function.
			switch(p1) {
			case 1://total book
				int a=L.totalBorrowedBooks();
				System.out.println("Total number of borrowed books:"+a);
				break;
			case 2://the chose of get information
				int p2 = readPosInt("Type the user role (lender:1 borrower:2):");
				if(p2==1) {
					String str1=readLine("Please enter the user name:");
					int i = readPosInt("Enter the initial number of borrowed books:");
					L.addUser(new Lender(str1,i));
					System.out.println("Lender "+str1+" lending "+i+" has been added.");
				}
				else if(p2==2) {
					String str2=readLine("Please enter the user name:");
					int i1 = readPosInt("Enter the initial number of borrowed books:");
					L.addUser(new Lender(str2,i1));
					System.out.println("Borrower "+str2+" borrowing "+i1+" has been added.");
				}
				else {
					System.out.println("Unknown user role!");
				}
				break;
			case 3://the choose of add book
				String str3=readLine("Please enter the user name:");
				int b=L.getBook(str3);
				System.out.println("User "+str3+" borrow "+b+" book(s) ");
				break;
			case 4://the choose of add user;
				String str4=readLine("Please enter the user name:");
				int i2 = readPosInt("Enter the number of Books: ");
				L.moreBook(str4,i2);
				System.out.println("add successfully");
				break;
			case 5://reduce user
				String str5=readLine("Please enter the user name:");
				int i3 = readPosInt("Enter the number of Books: ");
				L.moreBook(str5,-i3);
				System.out.println("less successfully");
				break;
			case 6://quiz the function.
				System.out.println("Goodbye");
				System.exit(0);
				break;
			default://unknow choose
				System.out.println("UnKnow action");
			}
		}

	}
	private static Scanner input = new Scanner(System.in);
	private static String readLine(String a) {//use to read String information
		System.out.print(a);
		Scanner input = new Scanner(System.in);
		String str= input.nextLine();
		return str;
	}
	private static int readPosInt(String a) {//use to read int information.
		int c=0;
		boolean tboolean=true;
		while(true) {
		while(tboolean) {
			System.out.print(a);
			try {
			Scanner input = new Scanner(System.in);
			c= input.nextInt();
			input.nextLine();
			tboolean=false;
			}catch(InputMismatchException e){
				input.nextLine();
				System.out.println("integers only!");
			}
		}
			if(c>0) {
				return c;
			}
			else {
				System.out.println("Positive integers only!");
			}		
		}
	}
	
}
