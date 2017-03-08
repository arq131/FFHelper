import java.awt.Color;

import javax.swing.*;

public class ExpRequirePanel extends JPanel {
	/* info contains all the required information to display exp */
	Constant info = new Constant();
	
	public ExpRequirePanel() {
		init();
		
	}
	
	public void init() {
		this.setBackground(new Color(50, 150, 150));
	}
	
	public void updateText(String text) {
		this.setName(text);
	}
}
