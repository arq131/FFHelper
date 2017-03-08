import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FrontPage extends JPanel implements ActionListener {
	
	/* JComponents */
	private JTextField BeginLevel;
	private JTextField EndLevel;
	private JComboBox<String> selectClass;
	private ExpRequirePanel requiredEXP;
	private JLabel requiredText;
	
	/* default values */
	String[] classNames = {"Alchemist", "Armorer", "Blacksmith", "Carpenter", "Culinarian", "Goldsmith", "Leatherworker", "Weaver"};
	
	
	
	public FrontPage() {
		init();
		this.setBackground(new Color(50, 100, 200));
		this.add(BeginLevel);
		this.add(EndLevel);
		this.add(selectClass);
		this.add(requiredEXP);
	}
	
	public void init() {
		//this.setLayout(new CardLayout());
		
		/* Settings for user inputting beginning level and end levels */
		this.BeginLevel = new JTextField(10);
		this.EndLevel = new JTextField(10);
		
		/* Settings for class selector */
		this.selectClass = new JComboBox(classNames);
		this.selectClass.setLocation(50, 50);
		this.selectClass.addActionListener(this);
		
		/* Settings for JPanels */
		this.requiredEXP = new ExpRequirePanel();
		this.requiredText = new JLabel("Required Exp: ");
		this.requiredEXP.add(requiredText);
		
	}

	@Override
	public synchronized void actionPerformed(ActionEvent event) {
		this.requiredEXP.updateText("Testing");
		this.requiredText.setText("Testing");
		requiredEXP.remove(requiredEXP);
		//add(requiredEXP);
		System.out.println("Action heard!");
		// test comment
		
	}
}
