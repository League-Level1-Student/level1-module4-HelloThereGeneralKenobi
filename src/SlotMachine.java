import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {

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
		frame.add(button);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(1200, 1000);

		try {
			label1 = createLabelImage("seven.png");
			label2 = createLabelImage("sad.png");
			label3 = createLabelImage("thumbsdown.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void spin() {
		Random randgen = new Random();
		
		for(int i = 0; i < 3; i ++) {
			if(random == 1) {
				frame.add(label1);
			}
			if(random == 2) {
				frame.add(label2);
			}
			if(random == 3) {
				frame.add(label3);
			}
		}
		
		
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}

