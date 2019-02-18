import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TYPE_OR_DIE {
	
	static JFrame frame;
	
	JLabel label = new JLabel();
	
	J
	
	char currentLetter = generateRandomLetter(); 

	char generateRandomLetter() {
	      Random r = new Random();
	      
	      return (char) (r.nextInt(26) + 'a');
	}
	
	public static void main(String[] args) {
		TYPE_OR_DIE type = new TYPE_OR_DIE();
		
	}
	
	void setup() {
		frame = new JFrame("T Y P E   O R   D I E");
	}
}
