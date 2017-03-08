import java.awt.CardLayout;
import java.awt.event.*;
import javax.swing.*;

public class MainInterface extends JFrame implements ActionListener{
	
	private JPanel begin;
	
	public MainInterface () {
		init();
		add(begin);
		this.setSize(1000, 750);
		this.setTitle("Final Fantasy Craft Helper");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	private void init() {
		this.begin = new FrontPage();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
