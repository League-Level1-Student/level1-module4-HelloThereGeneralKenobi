import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


	public class ChuckleClicker implements ActionListener {
		
		private JButton button1;
		private JButton button2;
		private JFrame frame;
		private JPanel panel;
	
	
	public static void main(String[] args) {
		ChuckleClicker chuckleClicker = new ChuckleClicker();
		chuckleClicker.makeButtons();
		
	}
	
	void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		button1 = new JButton("joke setup");
		button2 = new JButton("the funny");
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		
		frame.setVisible(true);
		frame.pack();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(pressed == button1) {
			JOptionPane.showMessageDialog(null, "How did the tree get on the internet?");
		}
		
		if(pressed == button2) {
			JOptionPane.showMessageDialog(null, "It loged on!");
		}
		
	}
}
