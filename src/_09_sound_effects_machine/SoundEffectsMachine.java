package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton button1= new JButton();
	JButton button2= new JButton();
	JButton button3= new JButton();
	

public static void main(String[] args) {
	
new SoundEffectsMachine().frame();

}

public void frame() {
	
	frame.setVisible(true);
	button1.setText("Airplane");
	button2.setText("Chain Saw");
	button3.setText("Slot machine");
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.add(panel);
	frame.pack();
}

	void airplane(){
		playSound("airplane-landing_daniel_simon.wav");
	}
	void chainSaw() {
		playSound("Chain Saw-SoundBible.com-247695753.wav");
	}
	void slotMachine() {
		playSound("slot-machine-daniel_simon.wav");
	}
	

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if (button1 == e.getSource()) {
		airplane();
		System.out.println("airplane");
	}
	else if (button2 == e.getSource()) {
		chainSaw();
	System.out.println("chain saw");
	}
	else {
		slotMachine();
		System.out.println("slot machine");
	}
}

private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}


}
