import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {

	JFrame frame;
	JPanel panel;
	JButton button;
	JLabel label1;
	JLabel label2;
	JLabel label3;

	public static void main(String[] args) {
		SlotMachine SlotMachine = new SlotMachine();
		SlotMachine.setup();
	}

	void setup() {
		frame = new JFrame("Gamble your problems away!");
		panel = new JPanel();
		button = new JButton("Spin");
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		button.addActionListener(this);

			label1 = createLabelImage("seven.png");
			label2 = createLabelImage("sad.png");
			label3 = createLabelImage("thumbsdown.png");
		
	}

	private void add(JButton button2) {
		// TODO Auto-generated method stub
		
	}

	void spin() {
		Random randgen = new Random();
		frame.remove(panel);
		panel = new JPanel();
		frame.add(panel);
		panel.add(button);
		
		
			int random = randgen.nextInt(3);
			if(random == 0) {
				label1 = createLabelImage("seven.png");
			}
			if(random == 1) {
				label1 = createLabelImage("sad.png");
			}
			if(random == 2) {
				label1 = createLabelImage("thumbsdown.png");
			}
			panel.add(label1);
			
			random = randgen.nextInt(3);
			if(random == 0) {
				label2 = createLabelImage("seven.png");
			}
			if(random == 1) {
				label2 = createLabelImage("sad.png");
			}
			if(random == 2) {
				label2 = createLabelImage("thumbsdown.png");
			}
			panel.add(label1);
			
			random = randgen.nextInt(3);
			if(random == 0) {
				label3 = createLabelImage("seven.png");
			}
			if(random == 1) {
				label3 = createLabelImage("sad.png");
			}
			if(random == 2) {
				label3 = createLabelImage("thumbsdown.png");
			}
			panel.add(label1);
			panel.add(label2);
			panel.add(label3);
			
		frame.pack();
		
		
	}

	private JLabel createLabelImage(String fileName) {
		JLabel imageLabel = null;
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		imageLabel = new JLabel(icon);
		
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		spin();
	}
}

