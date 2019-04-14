import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	
	JFrame frame;
	JPanel panel;
	
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
	}
	
	void drawButtons(int num) {
		
	}
}
