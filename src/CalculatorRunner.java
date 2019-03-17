import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculatorRunner {
	
static JFrame frame;
static JPanel panel;
static Button add;
static Button subtract;
static Button divide;
static Button multiply;

	public static void main(String[] args) {
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		add = new Button("Add");
		subtract = new Button("Subtract");
		divide = new Button("Divide");
		multiply = new Button("Multiply");
		panel.add(add);
		panel.add(subtract);
		panel.add(divide);
		panel.add(multiply);
		frame.pack();
	}
	

}
