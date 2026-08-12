import java.awt.Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class ViewMoreBook extends View<ControllerMoreBook>{
	private JTextField t1;
	private JTextField t2;
	public ViewMoreBook(Library m, ControllerMoreBook c) {
		super(m,c);
		m.addListener(this);
		update();
		this.setTitle("More Book");
		t1=new JTextField("Please input a user here: ");
		t1.setSize(400,200);
		t2=new JTextField("please input a number here: ");
		t2.setSize(400,200);
		Button b=new Button("More Book");
		b.addActionListener(new ActionListener() {
	            @Override
	    public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, c.moreBook(t1.getText(),t2.getText()), "ÏûÏ¢",JOptionPane.INFORMATION_MESSAGE);
            }
	    });
		this.setLayout(new GridLayout(3,1));
		this.add(t1);
		this.add(t2);
		this.add(b);
		this.setVisible(true);
	}
	public void update() {
		
	}
}
