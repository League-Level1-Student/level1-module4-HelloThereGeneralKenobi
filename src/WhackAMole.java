import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	
	JFrame frame;
	JPanel panel;
	Random randgen = new Random();
	int random = randgen.nextInt(24);
	int score = 0;
	int wrong = 0;
	Date date = new Date();
	
	public static void main(String[] args) {
		WhackAMole Whack = new WhackAMole();
		Whack.setup();
		
	}
	
	void setup() {
		frame = new JFrame("Whack a Button for Fame and Glory");
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(600, 800);
		drawButtons(random);
	}
	
	void drawButtons(int num) {
		for(int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if(i == num) {
				button.setText("Mole!");
			}
		}
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton yoshi = new JButton();
		yoshi = (JButton) e.getSource();
		if(yoshi.getText().equals("Mole!")) {
			score++;
			speak("Epic!");
		}
		else {
			wrong++;
			speak("Creeper Aw Man");
		}
		panel.removeAll();
		int random = randgen.nextInt(24);
		drawButtons(random);
		if(score == 10) {
			endGame(date, score);
		}
		if(wrong == 5) {
			speak("You suck!");
			endGame(date, score);
		}
	}
	
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
}
