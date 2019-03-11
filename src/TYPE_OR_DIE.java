import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TYPE_OR_DIE implements KeyListener {
	
	static JFrame frame;
	
	static JLabel label;
	
	char currentLetter;
	
	public static void main(String[] args) {
		TYPE_OR_DIE type = new TYPE_OR_DIE();
		
		type.setup();
		
	}
	
	void setup() {
		currentLetter = generateRandomLetter();
		frame = new JFrame("T Y P E   O R   D I E");
		frame.setVisible(true);
		label = new JLabel();
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(currentLetter + "");
		frame.add(label);
		frame.setSize(200, 300);
		frame.addKeyListener(this);
	}
	
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	      
}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		if(currentLetter == (e.getKeyChar())) {
			frame.setBackground(Color.GREEN);
			System.out.println("Correct");
			label.setOpaque(true);
			label.setBackground(Color.green);
		} 
		else {
			frame.setBackground(Color.red);
			label.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
	}
}
