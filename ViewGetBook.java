import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ViewGetBook extends View<ControllerGetBook>{
	private JTextField t;
	public ViewGetBook(Library m,ControllerGetBook c) throws HeadlessException{
		super(m,c);
		m.addListener(this);
		update();
			this.setTitle("GetBook");	        
	        t = new JTextField("Type your user name here: ");
	        t.setSize(400,200);
	        Button b=new Button("Tell me the book number:");
	        b.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(null, c.getBook(t.getText()), "ÏûÏ¢",JOptionPane.INFORMATION_MESSAGE);
	            }
	        });
	        this.setLayout(new GridLayout(2,1));
	        this.add(t);
	        this.add(b);
	        this.setVisible(true);
	}
	public void update() {
		
	}
}
