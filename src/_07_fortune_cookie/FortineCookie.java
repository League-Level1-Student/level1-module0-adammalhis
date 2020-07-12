package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortineCookie implements ActionListener {
public void showButton() {
	
	System.out.println("BUTTON CLICKED");
	JFrame frame= new JFrame();
	frame.setVisible(true);
	JButton Button= new JButton();
	frame.add(Button);
	frame.pack();
	Button.addActionListener(this);
		
	
	
	
	
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	int Bob= new Random().nextInt(5); 
	if (Bob==(0)) {
	JOptionPane.showMessageDialog(null, "You will die tommarow");
	}
	else if (Bob==(1)) {
		JOptionPane.showMessageDialog(null, "You will get a trillion dollars");
	}
	else if (Bob==(2)) {
		JOptionPane.showMessageDialog(null, "You will have your eyballs slowely fall out of your eyes when reading a book.");
	}
	else if (Bob==(3)) {
		JOptionPane.showMessageDialog(null, "You will fall in a hole and land on a million dollars that are like confetee.");
	
	}
	else {
		JOptionPane.showMessageDialog(null, "You will live tommorow");
	}



}
}
