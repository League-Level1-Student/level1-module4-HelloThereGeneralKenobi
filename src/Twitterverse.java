import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Twitterverse {
JFrame frame;
JPanel panel;
JButton button;
JTextField search;
	
	
	public static void main(String[] args) {
		Twitterverse Twitterverse = new Twitterverse();
		Twitterverse.setup();
	}
	
	void setup() {
		frame = new JFrame("");
		panel = new JPanel();
		button = new JButton("Search the Twitterverse");
		search = new JTextField();
		frame.add(panel);
		panel.add(button);
		panel.add(search);
	}

}
