
public interface IUser {//the IUSer is a Interface,contain some information
	public String getName();
	public int getBook();
	public void moreBook(int number) throws NotALenderException;
}
