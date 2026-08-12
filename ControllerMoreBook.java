
public class ControllerMoreBook extends Controller{//the conttroller of MoreBook.
	public ControllerMoreBook(Library m) {
		super(m);
	}
	public String moreBook(String name, String number) {//use to call the function
		
		try {
			int i=Integer.parseInt(number);
			m.moreBook(name, i);
		}catch(UnknownUserException e) {
			return "user "+name+" Unknow";
		}catch(NotALenderException e) {
			return "A borrower can not lend"+number+"books";
		}catch(NumberFormatException e) {
			return "This is not a number";
		}
		return "";
	}
}
