import javax.swing.*;
import java.awt.*;
public abstract class View<T extends Controller> extends JFrame implements ModelListener{
	protected Library m;
	protected T c;
	public View(Library m,T c) {
		this.m=m;
		m.addListener(this);
		this.c=c;
		this.setSize(400, 300);
	    this.setResizable(false);//fix size of frame
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	}
	public abstract void update();
}
