import java.awt.Color;
import java.util.*;

import javax.swing.*;

public class ExpRequirePanel extends JPanel {
	/* info contains all the required information to display exp */
	private Constant info = new Constant();
	public Hashtable<Integer, Integer> exp;
	
	public ExpRequirePanel() {
		init();
		
	}
	
	public void init() {
		this.setBackground(new Color(50, 150, 150));
		this.exp = info.getExp();
	}
	
	public void updateText(String text) {
		this.setName(text);
	}
	
	public int getRequiredExp(int begin, int end) {
		int required = 0;
		for (int i = begin; i < end; i++) {
			required += exp.get(i);
		}
		return required;
	}
}