package PreFinalsTP;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class taskPerformance extends JFrame implements ActionListener
{

	JLabel titleLabel = new JLabel();
	JLabel scissorIconLabel = new JLabel();
	JLabel paperIconLabel = new JLabel();
	JLabel stoneIconLabel = new JLabel();
	
	JLabel scissorrIconLabel = new JLabel();
	JLabel paperrIconLabel = new JLabel();
	JLabel stoneeIconLabel = new JLabel();
	
	JPanel titlePanel = new JPanel();
	JPanel scissorPanel = new JPanel();
	JPanel paperPanel = new JPanel();
	JPanel stonePanel = new JPanel();
	
	JPanel scissorrPanel = new JPanel();
	JPanel paperrPanel = new JPanel();
	JPanel stoneePanel = new JPanel();
	
	JButton button = new JButton();
	
	taskPerformance()
	{
//IconImage		
		ImageIcon Image = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\flag icon.jfif");
		this.setIconImage(Image.getImage());
		
//ScissorImage		
		ImageIcon Scissor = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Scissor.png");
		Scissor.setImage(Scissor.getImage().getScaledInstance(90,90,90)); //set the size of the imageicon
		
//PaperImage		
		ImageIcon Paper = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Paper.png");
		Paper.setImage(Paper.getImage().getScaledInstance(90,90,90));  
		
//StoneImage		
		ImageIcon Stone = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Stone.png");
		Stone.setImage(Stone.getImage().getScaledInstance(90,90,90));  			
				
//ScissorrImage		
		ImageIcon Scissorr = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Scissorr.png");
		Scissorr.setImage(Scissorr.getImage().getScaledInstance(90,90,90)); //set the size of the imageicon
				
//PaperrImage		
		ImageIcon Paperr = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Paperr.png");
		Paperr.setImage(Paperr.getImage().getScaledInstance(90,90,90));  
				
//StoneeImage		
		ImageIcon Stonee = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Stonee.png");
		Stonee.setImage(Stonee.getImage().getScaledInstance(90,90,90)); 		
		
//Title Label		
		titleLabel.setText("Bato-Bato Pick");                         //Set text titleLabel		
		titleLabel.setFont(new Font("Calbri", Font.PLAIN, 20));       //This will set font of text
		titleLabel.setVerticalAlignment(JLabel.CENTER);               //Set Vertical position of text within titleLabel
		titleLabel.setHorizontalAlignment(JLabel.CENTER);             //Set Horizontal position of text within titleLabel
		
//scissorIcon Label		
		scissorIconLabel.setIcon(Scissor);	
		
//paperIcon Label		
		paperIconLabel.setIcon(Paper);		

//stoneIcon Label		
		stoneIconLabel.setIcon(Stone);			
		
//scissorIcon Label		
		scissorrIconLabel.setIcon(Scissorr);	
				
//paperIcon Label		
		paperrIconLabel.setIcon(Paperr);		

//stoneIcon Label		
		stoneeIconLabel.setIcon(Stonee);			
		
//titlePanel		
		titlePanel.setBackground(new Color(0xFEFEBE));	              //background color of the panel
		titlePanel.setBounds(400,10, 190,40); 	                      //Set dimensions to frame&panel
		
		titlePanel.add(titleLabel);
		
//ScissorPanel		
		scissorPanel.setBackground(new Color(0xFEFEBE));	                  
		scissorPanel.setBounds(120,60, 150,120); 
		
		scissorPanel.add(scissorIconLabel);
		
//PaperPanel		
		paperPanel.setBackground(new Color(0xFEFEBE));	                  
		paperPanel.setBounds(120,200, 150,120); 
				
		paperPanel.add(paperIconLabel);		
		
//StonePanel		
		stonePanel.setBackground(new Color(0xFEFEBE));	                  
		stonePanel.setBounds(120,340, 150,120); 
						
		stonePanel.add(stoneIconLabel);			
		
//ScissorPanel		
		scissorrPanel.setBackground(new Color(0xFEFEBE));	                  
		scissorrPanel.setBounds(720,340, 150,120); 
				
		scissorrPanel.add(scissorrIconLabel);
				
//PaperPanel		
		paperrPanel.setBackground(new Color(0xFEFEBE));	                  
		paperrPanel.setBounds(720,60, 150,120); 
						
		paperrPanel.add(paperrIconLabel);		
			
//StonePanel		
		stoneePanel.setBackground(new Color(0xFEFEBE));	                  
		stoneePanel.setBounds(720,200, 150,120); 
								
		stoneePanel.add(stoneeIconLabel);					
		
//JButton
		button = new JButton();	               //Creates a button 
		button.setBounds(435, 180, 120, 50);    //Set size or bounds of a button
		button.addActionListener(this);        //Adds an Action Listener
		button.setText("Pick!");               //Set text
		button.setFocusable(false);            //this will get rid off the lines along side the text button 
		
		button.setFont(new Font("Calbri", Font.PLAIN, 18));     //Sets a Font styles of a text
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(new Color(0xFEFEFE));                
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.add(titlePanel);
		
		this.add(scissorPanel);
		this.add(paperPanel);
		this.add(stonePanel);
		
		this.add(scissorrPanel);
		this.add(paperrPanel);
		this.add(stoneePanel);
		
		this.add(button);
		
		this.setTitle("BatoBatoPick");                                //Title of the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          //Close frame
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(1000,550);                                       //Size of the frame  
		this.setVisible(true);                                        //Make the this Visible
		
		this.getContentPane().setBackground(new Color(0xFEFEBE));	  //background color
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if (arg0.getSource() == button) 
		{
			this.dispose();
			
			Pick newWindow = new Pick();
		}
	}
}
