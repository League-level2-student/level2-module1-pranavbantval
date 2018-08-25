package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton b2 = new JButton();
	JTextArea l=new JTextArea();
	String x;
	String y="";
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		new GuestBook().createUI();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
public void	createUI(){
f.add(p);
	f.setVisible(true);
	p.add(b);
	p.add(b2);
	p.add(l);
	b.addActionListener(this);
	b2.addActionListener(this);
	b.setText("Add Name");
	b2.setText("View Names");
	f.pack();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	JButton bp = (JButton)e.getSource();
	if(bp.equals(b)) {
		 x = JOptionPane.showInputDialog("Type Name");
		names.add(x);
	}
	else if(bp.equals(b2)) {
		y="";
		for (int i = 0; i < names.size(); i++) {
			y=y+"\n"+names.get(i);
		l.setText(y);
		
		}
		f.pack();
	}
}
	}

