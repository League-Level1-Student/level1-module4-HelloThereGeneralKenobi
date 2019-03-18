import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner implements ActionListener{
	
static JFrame frame;
static JPanel panel;
static JButton add;
static JButton subtract;
static JButton divide;
static JButton multiply;
static JTextField search;
static JTextField search2;
JLabel label;
Calculator Calculator;


	public static void main(String[] args) {
		CalculatorRunner CalculatorRunner = new CalculatorRunner();
		CalculatorRunner.setup();
	}
	
	void setup() {
		Calculator = new Calculator();
		
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		search = new JTextField();
		search2 = new JTextField();
		add = new JButton("Add");
		subtract = new JButton("Subtract");
		divide = new JButton("Divide");
		multiply = new JButton("Multiply");
		search.setPreferredSize(new Dimension(150, 30));
		search2.setPreferredSize(new Dimension(150, 30));
		panel.add(search);
		panel.add(search2);
		panel.add(add);
		panel.add(subtract);
		panel.add(divide);
		panel.add(multiply);
		label = new JLabel();
		panel.add(label);
		frame.pack();
		
		add.addActionListener(this);
		subtract.addActionListener(this);
		divide.addActionListener(this);
		multiply.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int number = Integer.parseInt(search.getText());
		int number2 = Integer.parseInt(search2.getText());
		JButton pressed = (JButton) e.getSource();
		if(pressed == add) {
			String a = String.valueOf((Calculator.add(number, number2)));
			label.setText(a);
			
		}
		if(pressed == subtract) {
			String a = String.valueOf(Calculator.subtract(number, number2));
			label.setText(a);
		}
		if(pressed == divide) {
			String a = String.valueOf(Calculator.divide(number, number2));
			label.setText(a);
		}
		if(pressed == multiply) {
			String a = String.valueOf(Calculator.multiply(number, number2));
			label.setText(a);
		}
	}

}
