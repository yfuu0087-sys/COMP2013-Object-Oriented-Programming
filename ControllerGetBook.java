
public class ControllerGetBook extends Controller{//the function of getBook
	public ControllerGetBook (Library m) {
		super(m);
	}
	public String getBook(String name) {//to call the function in Library
		String str1;
		try {
			int a=m.getBook(name);
			str1=String.valueOf(a);
		}catch(UnknownUserException e) {
			str1="User "+name+" Unknow.";
		}
		return str1;
	}
}
