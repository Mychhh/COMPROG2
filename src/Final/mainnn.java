package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainnn extends JFrame implements ActionListener
{

//Objects
	JMenuBar mainBar = new JMenuBar();
	
	JMenu menu1 = new JMenu("File");
	JMenu menu2 = new JMenu("EventType");
	
	JMenuItem exit = new JMenuItem("Exit");
	JMenu adult = new JMenu("Adult"); 
	JMenu child = new JMenu("Child");
	
	JMenuItem adultBday = new JMenuItem("Birthday");
	JMenuItem anniv = new JMenuItem("Anniversary"); 
	JMenuItem retirement = new JMenuItem("Retirement");
	JMenuItem adultOther = new JMenuItem("Other");
	
	JMenuItem childBday = new JMenuItem("Birthday");
	JMenuItem childOther = new JMenuItem("Other");
	
	JPanel currentPanel = new JPanel();
	JPanel otherPanel = new JPanel();
	
	JLabel currentLabel = new JLabel();
	JLabel otherLabel = new JLabel("We have lots of ideas for memory events");
	
	void composeMenus()
	{
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
	}
	
	void addActionListeners()
	{
//Adding action listeners
		adult.addActionListener(this);
		child.addActionListener(this);
		
		exit.addActionListener(this);
		
		adultBday.addActionListener(this);
		anniv.addActionListener(this);
		retirement.addActionListener(this);
		adultOther.addActionListener(this);
		
		childBday.addActionListener(this);
		childOther.addActionListener(this);
	}

	void layoutComponents()
	{
//creating layout
		currentPanel.add(currentLabel);
		otherPanel.add(otherLabel);
	}

//Constructors to modify the JFrame	
	mainnn()
	{
		composeMenus();
		addActionListeners();
		layoutComponents();
		
        this.setJMenuBar(mainBar);                            //adding menuBar to a frame
		
        this.add(currentPanel);
        this.add(otherPanel);
        
        this.setTitle("Party Planner");
        
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
//Note: I used this insteas of JFrame because we extends JFrame to our class instead of declaring it
//      So it will behave just like a JFrame without declaring it
	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource() == exit)
		{
			System.exit(0);
		}
		else if(arg0.getSource() == adultBday) 
		{
			currentPanel.setVisible(true);     //make currentPanel Visible to true just in case the it becomes false because of the adultOther event
			otherPanel.setBackground(null);    //removes the background color just in case the adulOther event triggered before this events
			
			//sets the background color and text on the current panel and label
			currentPanel.setBackground(Color.YELLOW);
			currentLabel.setText("Celebrate Another Year!");
		}
		else if(arg0.getSource() == anniv) 
		{
			currentPanel.setVisible(true);
			otherPanel.setBackground(null);
			
			currentPanel.setBackground(Color.ORANGE);
			currentLabel.setText("Look Forward to Golden Years!");
		}
		else if(arg0.getSource() == retirement) 
		{
			currentPanel.setVisible(true);
			otherPanel.setBackground(null);
			
			currentPanel.setBackground(Color.GREEN);
			currentLabel.setText("Cheers to Hardwork");
		}
		else if(arg0.getSource() == adultOther) 
		{
			currentPanel.setVisible(false);
			otherPanel.setBackground(Color.ORANGE);
		}
		else if(arg0.getSource() == childBday) 
		{
			currentPanel.setVisible(true);
			otherPanel.setBackground(null);
			
			currentPanel.setBackground(Color.PINK);
			currentLabel.setText("Throw the best Birthday Party!");
		}
		else if(arg0.getSource() == childOther) 
		{
			currentPanel.setVisible(false);
			otherPanel.setBackground(Color.ORANGE);
		}
	}
	
	public static void main(String[] args)
	{
		new mainnn(); // I did'nt instantiate the class because I have nothing to do with it
	}

}
