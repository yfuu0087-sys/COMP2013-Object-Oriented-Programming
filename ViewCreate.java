import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class ViewCreate extends View<ControllerCreate>{
	private JTextField t1;
	private JTextField t2;
	private JComboBox<String> cb;
	public ViewCreate(Library m, ControllerCreate c) {
		super(m,c);
		m.addListener(this);
		update();
		this.setTitle("Add user");
		t1=new JTextField("Please type a new user name here: ");
		t1.setSize(400,200);
		t2=new JTextField("please input the books number: ");
		t2.setSize(400,200);
        String[] listData = new String[]{"Lender","Borrower"};
        cb=new JComboBox<>(listData);
		Button b=new Button("Create");
		b.addActionListener(new ActionListener() {
            @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, c.create(t1.getText(),t2.getText(),cb.getSelectedIndex()), "ÏûÏ¢",JOptionPane.INFORMATION_MESSAGE);
        }
    });
		this.setLayout(new GridLayout(4,1));
		this.add(t1);
		this.add(t2);
		this.add(cb);
		this.add(b);
		this.setVisible(true);
	}
	public void update() {
		
	}
}
