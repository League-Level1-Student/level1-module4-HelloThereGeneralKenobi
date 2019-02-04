import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Treat");
	JButton button2 = new JButton("Trick");
	
	public static void main(String[] args) {
		
		NastySurprise n = new NastySurprise();
		n.UI();
	}
	
	public void UI() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			showPictureFromTheInternet("https://i.kym-cdn.com/photos/images/original/001/297/938/8e6.png");
		}
		else {
			showPictureFromTheInternet("https://i.kym-cdn.com/entries/icons/mobile/000/025/951/DCOJYfnXkAAyS0I.jpg");
		}
	}
}
