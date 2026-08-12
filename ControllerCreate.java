
public class ControllerCreate extends Controller{//the controller of create.
	public ControllerCreate(Library m) {
		super(m);
	}
	public String  create(String name, String number, int type) {//to call creat function in library.
		try {
			int i = Integer.parseInt(number);
			if(type==0) {
				m.addUser(new Lender(name,i));
				
			}
			else if(type==1) {
				m.addUser(new Borrower(name,i));
			}
			return "";
		}catch(NotALenderException e) {
			return "A new borrower can not Lend books.";
		}catch(NumberFormatException e) {
			return "For input String "+number;
		}

	}
}
