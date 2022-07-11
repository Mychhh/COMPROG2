package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener
{

//Objects
	JMenuBar mainBar;
	
	JMenu menu1;
	JMenu menu2;
	
	JMenuItem exit;
	JMenuItem adult; 
	JMenuItem child;
	
	JMenuItem adultBday;
	JMenuItem anniv; 
	JMenuItem retirement;
	JMenuItem adultOther;
	
	JMenuItem childBday;
	JMenuItem childOther;
	
	JPanel currentPanel;
	JPanel otherPanel;
	
	JLabel currentLabel;
	JLabel otherLabel;
	
//Constructor	
	Main()
	{
//instantiating objects	
		mainBar = new JMenuBar();
		
		menu1 = new JMenu("File");
		menu2 = new JMenu("EventType");
		
		exit = new JMenuItem("Exit");
		adult = new JMenuItem("Adult");
		child = new JMenuItem("Child");
		
		adultBday = new JMenuItem("Birthday");
		anniv = new JMenuItem("Anniversary");
		retirement = new JMenuItem("Retirement");
		adultOther = new JMenuItem("Other");
		
		childBday = new JMenuItem("Birthday");
		childOther = new JMenuItem("Other");
		
		currentPanel = new JPanel();
		otherPanel = new JPanel();
		
		currentLabel = new JLabel();
		otherLabel = new JLabel("We have lots of ideas for memory events");
		
		
//adding components		
		mainBar.add(menu1);
		mainBar.add(menu2);
		
		menu1.add(exit);
		menu2.add(adult);
		menu2.add(child);
		
		adult.add(adultBday);
		adult.add(anniv);
		adult.add(retirement);
		adult.add(adultOther);
		
		child.add(childBday);
		child.add(childOther);
	
        this.add(mainBar);
		
        this.setTitle("Party Planner");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}	
	
	void composeMenus()
	{
		
	}
	
	void addActionListeners()
	{
		
	}

	void layoutComponents()
	{
		
	}


	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
	}
	
	public static void main(String[] args)
	{
		new Main();
	}

}
