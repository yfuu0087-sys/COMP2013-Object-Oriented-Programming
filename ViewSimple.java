import javax.swing.*;
import java.awt.*;

public class ViewSimple extends View implements ModelListener{
	private JLabel lable=new JLabel();
	
	public ViewSimple(Library m,Controller c) throws HeadlessException{
		super(m,c);
		m.addListener(this);
		update();
		 this.add(this.lable);
	        this.setSize(400, 300);
	        this.setResizable(false);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setVisible(true);
	}
	
	public void update() {
		//lable=new JLabel("total number of borrowed books:"+m.totalBorrowedBooks());//testcode
		lable.setText("total number of borrowed books:"+m.totalBorrowedBooks());
	}
}
