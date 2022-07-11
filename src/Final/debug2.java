package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class debug2 extends JFrame implements ActionListener
{

private JMenuBar mainBar = new JMenuBar();
private JMenu menu1 = new JMenu("FILE");
private JMenu menu2 = new JMenu("EVENT TYPES");
private JMenuItem exit = new JMenuItem("Exit");
private JMenu adult = new JMenu ("ADULT");
private JMenu child = new JMenu ("CHILD");

private JMenuItem adultBday = new JMenuItem("Birthday");
private JMenuItem anniv = new JMenuItem("Anniversary");
private JMenuItem retirement = new JMenuItem("Retirement");
private JMenuItem adultOther = new JMenuItem("Others");

private JMenuItem Cbirth = new JMenuItem("Birthday");
private JMenuItem Cothers = new JMenuItem("Others");

private JPanel p1 = new JPanel();
private JPanel p2 = new JPanel();

private JLabel currentLabel = new JLabel(" ");
private JLabel otherLabel = new JLabel("We have lots of ideas for memorable events");

private final int Width = 400;
private final int height = 40;

public debug2() {
	setTitle("PARTY PLANNER");
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout (new FlowLayout());
	setJMenuBar(mainBar);
	mainBar.add(menu1);
	mainBar.add(menu2);
	menu1.add(exit);
	menu2.add(adult);
	menu2.add(child);
	
	adult.add(adultBday );
	adult.add(anniv);
    adult.add(retirement);
    adult.add(adultOther);
    
    
    child.add(Cbirth);
    child.add(Cothers);
    
    exit.addActionListener(this);
    adultBday .addActionListener(this);
	anniv.addActionListener(this);
	retirement.addActionListener(this);
	adultOther.addActionListener(this);
	Cbirth.addActionListener(this);
	Cothers.addActionListener(this);
	
	add (p1);
	add(p2);
	add (currentLabel);
    add (otherLabel);
	Font font = new Font ("Arial",Font.BOLD,16);
	otherLabel.setFont(font);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	String textbday = "Celebrate another year!";	
	String textanniv= "LOOK FORWARD TO GOLDEN YEARS!";
	String textretirement="CHEERS TO HARDWORK";
	String adultother = " ";
	String Cbirthday = "Throw the best birthday! ";
	String Cother = "";
	Object source = e.getSource();
	Container con = getContentPane();
	if (source == exit) {
		System.exit(0);}
	else if (source == adultBday ) {
    con.add(p1);
	p1.setBackground(Color.YELLOW);
	p1.setSize (Width,height);
	currentLabel.setText(textbday);
	currentLabel.setFont(new Font("Arial",Font.BOLD,16));
	p1.add(currentLabel);

	con.add(p2);
	p2.setSize (40,200);
	p2.add (otherLabel);    
	}	
	else if (source == anniv) {
			
		    con.add(p1);
			p1.setBackground(Color.ORANGE);
			p1.setSize (Width,height);
			currentLabel.setText(textanniv);
			currentLabel.setFont(new Font("Arial",Font.BOLD,16));
			p1.add(currentLabel);
				
	
	
			con.add(p2);
			p2.setSize (40,200);
			p2.add (otherLabel);   
	}
	else if (source == retirement)
	{
	    con.add(p1);
		p1.setBackground(Color.GREEN);
		p1.setSize (Width,height);
		currentLabel.setText(textretirement);
		currentLabel.setFont(new Font("Arial",Font.BOLD,16));
		p1.add(currentLabel);
			
		
		con.add(p2);
		p2.setSize (40,200);
		p2.add (otherLabel);   
	}
	else if (source == adultOther)
		{	
	    con.add(p1);
		p1.setBackground(Color.WHITE);
		p1.setSize (Width,height);
		currentLabel.setText(adultother);
		currentLabel.setFont(new Font("Arial",Font.BOLD,16));
		p1.add(currentLabel);
			
		
		con.add(p2);
		p2.setSize (40,200);
		p2.add (otherLabel);   	
}
		

	else if (source == Cbirth)
	{	
    con.add(p1);
	p1.setBackground(Color.PINK);
	p1.setSize (Width,height);
	currentLabel.setText(Cbirthday);
	currentLabel.setFont(new Font("Arial",Font.BOLD,16));
	p1.add(currentLabel);
		
	
	
	con.add(p2);
	p2.setBackground(Color.WHITE);
	p2.setSize (40,200);
	p2.add (otherLabel);   	
}

	else if (source == Cothers)
	{	
    con.add(p1);
	p1.setBackground(Color.ORANGE);
	p1.setSize (Width,height);
	currentLabel.setText(adultother);
	currentLabel.setFont(new Font("Arial",Font.BOLD,16));
	p1.add(currentLabel);
		
	
	con.add(p2);
	p1.setSize (40,200);
	p1.add (otherLabel);   	
}
}
public static void main (String[] args) {
	
	debug2 mFrame = new debug2();
	final int width = 400;
	final int height = 200;
	mFrame.setSize(width,height);
	mFrame.setVisible(true);
} 
}
